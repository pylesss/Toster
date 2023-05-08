package net.pyles.toster.android

import net.pyles.toster.Greeting

class GreetPresenter(val greeting: Greeting) {
    fun print() = greeting.greeting()
}