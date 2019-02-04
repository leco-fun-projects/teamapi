package co.l3co.domain

import java.util.*
import javax.persistence.*

data class Member(
    val id: UUID,
    val name: String,
    val mail: String,
    val position: String,
    val scmUrl: String,
    val projects: List<Project>?,
    val skills: List<Skill>?
)
