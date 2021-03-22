package com.indy.ebalance.realtimemeasure.api

import com.indy.ebalance.device.DeviceIdType
import com.indy.ebalance.realtimemeasure.MeasureDate
import com.indy.ebalance.realtimemeasure.MeasureType

data class NewRealTimeMeasureRequest(
    val deviceId: DeviceIdType,
    val measureDate: MeasureDate,
    val measure: MeasureType
)
