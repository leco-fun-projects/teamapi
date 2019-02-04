package co.l3co.domain

import java.util.*

data class Contact(
    val id: UUID,
    val department: String,
    val phone: String,
    val mail: String,
    val client: Client?
)
