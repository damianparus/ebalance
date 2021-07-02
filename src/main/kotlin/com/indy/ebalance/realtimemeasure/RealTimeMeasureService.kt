package com.indy.ebalance.realtimemeasure

import com.indy.ebalance.realtimemeasure.api.NewRealTimeMeasureRequest
import com.indy.ebalance.realtimemeasure.db.DbRealTimeMeasure
import com.indy.ebalance.realtimemeasure.db.RealTimeMeasureRepository
import org.springframework.stereotype.Component

@Component
class RealTimeMeasureService(val realTimeMeasureRepository: RealTimeMeasureRepository) {

    fun newRealTimeMeasure(newRealTimeMeasureRequest: NewRealTimeMeasureRequest) {
        val dbRealTimeMeasure = DbRealTimeMeasure(
            deviceId = newRealTimeMeasureRequest.deviceId,
            measureTime = newRealTimeMeasureRequest.measureTime,
            measureValue = newRealTimeMeasureRequest.measureValue
        )
        realTimeMeasureRepository.save(dbRealTimeMeasure)
    }

}
