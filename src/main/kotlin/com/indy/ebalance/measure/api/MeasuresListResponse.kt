package com.indy.ebalance.measure.api

import com.indy.ebalance.measure.Measure

data class MeasuresListResponse(
    val items: Array<Measure>
)
