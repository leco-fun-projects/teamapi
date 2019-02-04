package co.l3co.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

data class Client(
    val id: UUID,
    val name: String,
    val documentId: String,
    val contacts: List<Contact>?,
    val projects: List<Project>?
)