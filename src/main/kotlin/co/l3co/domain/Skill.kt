package co.l3co.domain

import java.util.*

data class Skill(
    val id: UUID,
    val knowledge: Knowledge,
    val member: Member?,
    val skillMap: SkillMap
)
