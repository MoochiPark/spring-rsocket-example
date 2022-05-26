package io.wisoft.tutorial.rsocket.server

import java.time.LocalDateTime

data class SensingData(
    val voltage: Double = 0.0,
    val current: Double = 0.0,
    val code: Int = 0,
    val acState: Boolean = false,
    val dcState: Boolean = false,
    val sensingTime: LocalDateTime = LocalDateTime.MIN,
)
