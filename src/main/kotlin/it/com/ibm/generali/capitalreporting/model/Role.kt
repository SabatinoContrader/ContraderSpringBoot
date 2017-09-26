package it.com.ibm.generali.capitalreporting.model

import java.io.Serializable
import javax.persistence.*


@Entity
open class Role : Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0L
        private set

    @Column(unique = true)
    var description: String = ""

    @OneToMany(mappedBy = "role", cascade = arrayOf(CascadeType.ALL))
    var users: MutableSet<User> = mutableSetOf()

}
