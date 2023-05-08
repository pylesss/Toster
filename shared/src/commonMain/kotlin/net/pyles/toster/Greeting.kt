package net.pyles.toster

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class Greeting (private val platform: Platform){

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
//    private val platform: Platform = getPlatform()
//
//    private val httpClient = HttpClient {
//        install(ContentNegotiation) {
//            json(Json {
//                prettyPrint = true
//                isLenient = true
//                ignoreUnknownKeys = true
//            })
//        }
//    }
//
//    @Throws(Exception::class)
//    suspend fun greet(): String {
//        val rockets: List<RocketLaunch> =
//            httpClient.get("https://api.spacexdata.com/v5/launches").body()
//        val lastSuccessLaunch = rockets.last { it.launchSuccess == true }
//        return "Guess what it is! > ${platform.name.reversed()}!" +
//                "\nThere are only ${daysUntilNewYear()} left until New Year! 🎆" +
//                "\nThe last successful launch was ${lastSuccessLaunch.launchDateUTC} 🚀"
//        return  ""
//    }
}