package io.wisoft.tutorial.rsocket.server

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
class RSocketRouter {

    @MessageMapping("request-response")
    fun requestResponse(request: Message): Message? {
        println("Received request-response request: $request")
        return Message("SERVER", "RESPONSE")
    }

}
