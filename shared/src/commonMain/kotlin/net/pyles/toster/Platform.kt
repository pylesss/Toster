package net.pyles.toster

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform