package com.indy.ebalance.measure.api

data class NewMeasureResponse(
    val status: NewMeasureResponseStatus,
    val request: NewMeasureRequest
)

enum class NewMeasureResponseStatus {
    OK
}
