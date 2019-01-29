package co.l3co.domain

import java.util.*
import javax.persistence.*

//@Entity
data class Project(
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID,
    val name: String,
    val repository: String,
    val documentation: String,
//    @ManyToMany(cascade = [CascadeType.ALL])
//    @JoinTable(
//        name = "project_member",
//        joinColumns = [JoinColumn(name = "project_id", referencedColumnName = "id")],
//        inverseJoinColumns = [JoinColumn(name = "member_id", referencedColumnName = "id")]
//    )
    val members: List<Member>?
)
