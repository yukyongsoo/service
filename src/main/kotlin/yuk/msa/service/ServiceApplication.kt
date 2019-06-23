package yuk.msa.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer


@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
@EnableResourceServer
@SpringBootApplication
class ServiceApplication

fun main(args: Array<String>) {
    runApplication<ServiceApplication>(*args)
}
