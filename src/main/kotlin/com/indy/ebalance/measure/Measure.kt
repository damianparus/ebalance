package com.indy.ebalance.measure

import com.indy.ebalance.dimension.DimensionIdType

data class Measure(
    val dimensionId: DimensionIdType,
    val measureTime: MeasureTimeType,
    val measureValue: MeasureValueType
)
