package co.l3co.domain

import java.util.*
import javax.persistence.*

//@Entity
data class Member(
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID,
    val name: String,
    val mail: String,
    val position: String,
    val scmUrl: String,

//    @ManyToMany(mappedBy = "project")
    val projects: List<Project>?,

    val skills : List<Skill>?
)
