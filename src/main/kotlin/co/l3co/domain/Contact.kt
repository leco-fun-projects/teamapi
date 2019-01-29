package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
data class Contact(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID,
    val department: String,
    val phone: String,
    val mail: String,

    @ManyToOne
    @JoinColumn(name = "client_id")
    val client: Client?
)
