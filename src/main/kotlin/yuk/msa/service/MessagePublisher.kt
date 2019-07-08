package yuk.msa.service

import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Component

@Component
class MessagePublisher(private val source : Source) {
    fun publish(){
        val message = MessageBuilder.withPayload("test").build()
        source.output().send(message)
    }
}