package me.karun

import me.karun.Constants.gson
import me.karun.Constants.jsonType
import spark.kotlin.after
import spark.kotlin.get
import spark.kotlin.port

class App {
  fun message() = "hello world"
}

fun main(args: Array<String>) {
  port(4000)

  after {
    response.type(jsonType)
    response.header("Content-Encoding", "gzip")
  }

  get("/hi") {
    gson.toJson(mapOf("message" to App().message()))
  }
}
