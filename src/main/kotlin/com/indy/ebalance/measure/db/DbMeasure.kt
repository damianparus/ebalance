package com.indy.ebalance.measure.db

import com.indy.ebalance.dimension.DimesionIdType
import com.indy.ebalance.measure.MeasureTimeType
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.FieldType
import java.math.BigDecimal

@Document(collection = "measure")
@CompoundIndex(name = "dimensionId_measureTime_idx", def = "{'dimensionId':1, 'measureTime':1}", unique = true)
data class DbMeasure(

    val dimensionId: DimesionIdType,

    val measureTime: MeasureTimeType,

    @Field(targetType = FieldType.DECIMAL128)
    val measureValue: BigDecimal

)
