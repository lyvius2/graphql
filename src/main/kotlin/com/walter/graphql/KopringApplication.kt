package com.walter.graphql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//TODO : https://spring.io/guides/gs/graphql-server/
@SpringBootApplication
class KopringApplication

fun main(args: Array<String>) {
    runApplication<KopringApplication>(*args)
}
