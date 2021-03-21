package com.indy.ebalance.realtimemeasure.dto

import com.indy.ebalance.device.dto.DeviceIdType

data class NewRealTimeMeasure(
    val deviceId: DeviceIdType,
    val measureDate: MeasureDate,
    val measure: MeasureType
)
