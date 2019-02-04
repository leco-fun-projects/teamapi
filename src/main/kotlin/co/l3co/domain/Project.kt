package co.l3co.domain

import java.util.*

data class Project(
    val id: UUID,
    val name: String,
    val repository: String,
    val documentation: String,
    val skill: List<Skill>?,
    val members: List<Member>?
)
