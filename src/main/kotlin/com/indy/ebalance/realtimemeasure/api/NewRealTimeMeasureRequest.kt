package com.indy.ebalance.realtimemeasure.api

import com.indy.ebalance.device.DeviceIdType
import com.indy.ebalance.realtimemeasure.MeasureTimeType
import com.indy.ebalance.realtimemeasure.MeasureValueType

data class NewRealTimeMeasureRequest(
    val deviceId: DeviceIdType,
    val measureTime: MeasureTimeType,
    val measureValue: MeasureValueType
)
