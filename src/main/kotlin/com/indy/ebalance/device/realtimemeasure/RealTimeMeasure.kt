package com.indy.ebalance.device.realtimemeasure

import org.bson.types.Decimal128
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class RealTimeMeasure(
    @Id
    val id: ObjectId = ObjectId.get(),
    val deviceId: Int,
    val measureDate: Int,
    val measure: Decimal128
)
