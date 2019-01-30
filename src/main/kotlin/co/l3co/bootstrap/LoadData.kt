package co.l3co.bootstrap

import co.l3co.domain.*
import java.util.*

fun load(): Client {
    val contacts = arrayListOf(
        Contact(
            UUID.randomUUID(),
            "Sales",
            "1111",
            "aaa@gmail.com",
            null
        )
    )

    val python = Knowledge(
        UUID.randomUUID(),
        "Python",
        "Python Description"
    )

    val java = Knowledge(
        UUID.randomUUID(),
        "Java",
        "Java Description"
    )

    val kotlin = Knowledge(
        UUID.randomUUID(),
        "Kotlin",
        "Kotlin Description"
    )

    val skills = arrayListOf(
        Skill(
            UUID.randomUUID(),
            knowledge = python,
            skillMap = SkillMap.ADVANCED,
            member = null
        ),
        Skill(
            UUID.randomUUID(),
            knowledge = java,
            skillMap = SkillMap.ADVANCED,
            member = null
        ),
        Skill(
            UUID.randomUUID(),
            knowledge = kotlin,
            skillMap = SkillMap.BASIC,
            member = null
        )
    )

    val members = arrayListOf(
        Member(
            UUID.randomUUID(),
            name = "leco", mail = "leco@email.com",
            scmUrl = "http://teste.com",
            position = "sfd",
            projects = null,
            skills = skills
        )
    )

    val project = arrayListOf(
        Project(
            UUID.randomUUID(),
            name = "Apple",
            documentation = "http://teste.com",
            repository = "http://teste.com",
            members = members,
            skill = arrayListOf(
                Skill(
                    UUID.randomUUID(),
                    knowledge = python,
                    skillMap = SkillMap.INTERMEDIATE,
                    member = null
                ),
                Skill(
                    UUID.randomUUID(),
                    knowledge = java,
                    skillMap = SkillMap.ADVANCED,
                    member = null
                ),
                Skill(
                    UUID.randomUUID(),
                    knowledge = kotlin,
                    skillMap = SkillMap.INTERMEDIATE,
                    member = null
                )
            )
        )
    )

    val client = Client(
        UUID.randomUUID(),
        name = "apple",
        documentId = "12313123",
        contacts = contacts,
        projects = project
    )
    return client
}