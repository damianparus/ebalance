package com.indy.ebalance.realtimemeasure.db

import com.indy.ebalance.device.DeviceIdType
import com.indy.ebalance.realtimemeasure.MeasureTimeType
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType
import java.math.BigDecimal

@Document(collection = "realTimeMeasure")
@CompoundIndex(name = "deviceId_measureDate_idx", def = "{'deviceId':1, 'measureDate':1}", unique = true)
data class DbRealTimeMeasure(

    val deviceId: DeviceIdType,

    val measureTime: MeasureTimeType,

    @Field(targetType = FieldType.DECIMAL128)
    val measureValue: BigDecimal

)
