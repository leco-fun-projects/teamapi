package co.l3co.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Skill(
    val id: UUID,
    val knowledge: Knowledge,
    val member: Member?,
    val skillMap: SkillMap
)
