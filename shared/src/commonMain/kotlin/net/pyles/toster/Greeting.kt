package net.pyles.toster

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Guess what it is! > ${platform.name.reversed()}!"
    }
}