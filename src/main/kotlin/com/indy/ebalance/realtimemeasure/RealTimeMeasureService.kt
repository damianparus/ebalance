package com.indy.ebalance.realtimemeasure

import com.indy.ebalance.realtimemeasure.db.DbRealTimeMeasure
import com.indy.ebalance.realtimemeasure.db.RealTimeMeasureRepository
import com.indy.ebalance.realtimemeasure.dto.NewRealTimeMeasure
import org.springframework.stereotype.Component

@Component
class RealTimeMeasureService(private val realTimeMeasureRepository: RealTimeMeasureRepository) {

    fun saveRealTimeMeasure(newRealTimeMeasure: NewRealTimeMeasure): DbRealTimeMeasure {
        val dbRealTimeMeasure = DbRealTimeMeasure(
            deviceId = newRealTimeMeasure.deviceId,
            measureDate = newRealTimeMeasure.measureDate,
            measure = newRealTimeMeasure.measure
        )
        realTimeMeasureRepository.save(dbRealTimeMeasure)
        return dbRealTimeMeasure
    }

}
