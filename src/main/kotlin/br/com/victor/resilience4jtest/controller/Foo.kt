package br.com.victor.resilience4jtest.controller

import br.com.victor.resilience4jtest.service.FooService
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Foo(private val fooService: FooService) {

    @GetMapping
    fun foo(){
        fooService.foo()
    }

}