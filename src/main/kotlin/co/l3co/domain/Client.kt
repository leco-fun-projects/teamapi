package co.l3co.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

//@Entity
data class Client(
//    @Id
    val id: UUID,
    val name: String,
    val documentId: String,
//    @OneToMany(mappedBy = "client")
    val contacts: List<Contact>?,
//    @OneToMany(mappedBy = "client")
    val projects: List<Project>?
)