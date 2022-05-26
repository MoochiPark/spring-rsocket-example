package io.wisoft.tutorial.rsocket.server

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
@MessageMapping("")
class RSocketRouter(val repository: SensingDataRepository) {

    @MessageMapping("")
    suspend fun getLatestStream(n: Int): Flow<SensingData> =
        repository.getLatest(n)

}
