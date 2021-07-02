package com.indy.ebalance.measure.db

import com.indy.ebalance.device.DeviceIdType
import com.indy.ebalance.measure.MeasureTimeType
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType
import java.math.BigDecimal

@Document(collection = "measure")
@CompoundIndex(name = "deviceId_measureTime_idx", def = "{'deviceId':1, 'measureTime':1}", unique = true)
data class DbMeasure(

    val deviceId: DeviceIdType,

    val measureTime: MeasureTimeType,

    @Field(targetType = FieldType.DECIMAL128)
    val measureValue: BigDecimal

)
