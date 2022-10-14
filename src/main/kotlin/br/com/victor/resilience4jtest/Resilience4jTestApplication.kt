package br.com.victor.resilience4jtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Resilience4jTestApplication

fun main(args: Array<String>) {
    runApplication<Resilience4jTestApplication>(*args)
}
