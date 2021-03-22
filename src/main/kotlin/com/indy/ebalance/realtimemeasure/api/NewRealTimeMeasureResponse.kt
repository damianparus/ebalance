package com.indy.ebalance.realtimemeasure.api

data class NewRealTimeMeasureResponse(
    val status: NewRealTimeMeasureResponseStatus,
    val request: NewRealTimeMeasureRequest
)

enum class NewRealTimeMeasureResponseStatus {
    OK
}
