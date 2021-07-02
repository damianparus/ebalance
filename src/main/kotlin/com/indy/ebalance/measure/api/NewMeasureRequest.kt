package com.indy.ebalance.measure.api

import com.indy.ebalance.device.DeviceIdType
import com.indy.ebalance.measure.MeasureTimeType
import com.indy.ebalance.measure.MeasureValueType

data class NewMeasureRequest(
    val deviceId: DeviceIdType,
    val measureTime: MeasureTimeType,
    val measureValue: MeasureValueType
)
