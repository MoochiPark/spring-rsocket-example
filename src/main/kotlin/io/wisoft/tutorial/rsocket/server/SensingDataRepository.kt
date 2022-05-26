package io.wisoft.tutorial.rsocket.server

import java.time.LocalDateTime
import kotlin.random.Random
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.springframework.stereotype.Repository

@Repository
class SensingDataRepository {

    fun getLatest(n: Int): Flow<SensingData> =
        flow {
            for (i in n downTo 0) {
                emit(
                    SensingData(
                        voltage = Random.nextDouble(80.0, 83.0),
                        current = Random.nextDouble(-10.0, 20.0),
                        code = Random.nextInt(13),
                        acState = Random.nextBoolean(),
                        dcState = Random.nextBoolean(),
                        sensingTime = LocalDateTime.now().minusSeconds(10L * i)
                    )
                )
            }
        }

}
