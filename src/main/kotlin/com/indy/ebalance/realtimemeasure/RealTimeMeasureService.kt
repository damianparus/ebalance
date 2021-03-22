package com.indy.ebalance.realtimemeasure

import com.indy.ebalance.realtimemeasure.db.DbRealTimeMeasure
import com.indy.ebalance.realtimemeasure.db.RealTimeMeasureRepository
import com.indy.ebalance.realtimemeasure.api.NewRealTimeMeasureRequest
import org.springframework.stereotype.Component

@Component
class RealTimeMeasureService(private val realTimeMeasureRepository: RealTimeMeasureRepository) {

    fun newRealTimeMeasure(newRealTimeMeasureRequest: NewRealTimeMeasureRequest) {
        val dbRealTimeMeasure = DbRealTimeMeasure(
            deviceId = newRealTimeMeasureRequest.deviceId,
            measureDate = newRealTimeMeasureRequest.measureDate,
            measure = newRealTimeMeasureRequest.measure
        )
        realTimeMeasureRepository.save(dbRealTimeMeasure)

    }

}
