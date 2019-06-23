package yuk.msa.service

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter

@Configuration
class AuthConfig : ResourceServerConfigurerAdapter() {
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests().anyRequest().authenticated()
    }
}