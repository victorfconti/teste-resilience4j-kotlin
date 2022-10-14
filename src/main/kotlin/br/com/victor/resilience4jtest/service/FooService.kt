package br.com.victor.resilience4jtest.service

import io.github.resilience4j.retry.annotation.Retry
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpServerErrorException


@Service
class FooService(private val bar: Bar) {
    val log = LoggerFactory.getLogger("Foo")

    @Retry(name="foo", fallbackMethod = "fallBack")
    fun foo(){
        log.info("Attempt")
        bar.teste1()
    }

    fun fallBack(ex: Exception){
        log.error("Sou uma excessão")
        log.error("Oi: ", ex)
    }

}


@Service
class Bar {

    fun teste1(){
        throw HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR)
    }

    fun teste2(){
        println("Deu boa")
    }

}