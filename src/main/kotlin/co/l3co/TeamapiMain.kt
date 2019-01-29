package co.l3co

import co.l3co.domain.Client
import co.l3co.domain.Contact
import io.javalin.Javalin
import java.util.*

fun main() {
    val app = Javalin.create().start()

    val contacts = arrayListOf(
        Contact(
            UUID.randomUUID(),
            "Sales",
            "1111",
            "aaa@gmail.com",
            null
        )
    )

    val client = Client(
        UUID.randomUUID(),
        name = "apple",
        documentId = "12313123",
        contacts = contacts,
        projects = null
    )

    app.get("/") { ctx -> ctx.json(client) }
}