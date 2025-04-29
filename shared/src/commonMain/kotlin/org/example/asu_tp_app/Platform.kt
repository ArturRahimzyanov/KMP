package org.example.asu_tp_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform