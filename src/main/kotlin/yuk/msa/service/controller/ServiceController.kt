package yuk.msa.service.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("service")
class ServiceController {
    fun test() = "Hello"

}