package com.indy.ebalance.measure

import com.indy.ebalance.dimension.DimesionIdType

data class Measure(
    val dimesionId: DimesionIdType,
    val measureTime: MeasureTimeType,
    val measureValue: MeasureValueType
)
