package com.indy.ebalance.realtimemeasure.db


import com.indy.ebalance.device.dto.DeviceIdType
import com.indy.ebalance.realtimemeasure.dto.MeasureDate
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType
import java.math.BigDecimal

@Document(collection = "realTimeMeasure")
@CompoundIndex(name = "deviceId_measureDate_idx", def = "{'deviceId':1, 'measureDate':1}", unique = true)
data class DbRealTimeMeasure(

    val deviceId: DeviceIdType,

    val measureDate: MeasureDate,

    @Field(targetType = FieldType.DECIMAL128)
    val measure: BigDecimal

)
