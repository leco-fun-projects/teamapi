package co.l3co.domain

import java.util.*

data class Client(
    val id: UUID,
    val name: String,
    val documentId: String,
    val contacts: List<Contact>?,
    val projects: List<Project>?
)