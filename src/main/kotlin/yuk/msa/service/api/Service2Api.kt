package yuk.msa.service.api

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("service2")
interface Service2Api {
    @GetMapping
    @HystrixCommand
    fun hello() : String
}