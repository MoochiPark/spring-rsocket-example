package io.wisoft.tutorial.rsocket.server

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
@MessageMapping("")
class RSocketRouter {

//    @MessageMapping("")
//    fun requestResponse(request: Message): Message? {
//        println("Received request-response request: $request")
//        return Message("SERVER", "RESPONSE")
//    }

    @MessageMapping("")
    suspend fun requestStream(request: Message): Flow<Message> =
        flow {
            for (i in 1..10) {
                emit(Message("Server", "Response-$i"))
            }
        }

}
