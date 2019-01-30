package co.l3co

import io.javalin.Javalin
import co.l3co.bootstrap.load as Bootstrap

fun main() {
    val app = Javalin.create().start()
    app.get("/") { ctx -> ctx.json(Bootstrap()) }
}