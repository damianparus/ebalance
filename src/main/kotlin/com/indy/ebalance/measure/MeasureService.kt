package com.indy.ebalance.measure

import com.indy.ebalance.measure.api.NewMeasureRequest
import com.indy.ebalance.measure.db.DbMeasure
import com.indy.ebalance.measure.db.MeasureRepository
import org.springframework.stereotype.Component

@Component
class MeasureService(val measureRepository: MeasureRepository) {

    fun newMeasure(newMeasureRequest: NewMeasureRequest) {
        val dbMeasure = DbMeasure(
            deviceId = newMeasureRequest.deviceId,
            measureTime = newMeasureRequest.measureTime,
            measureValue = newMeasureRequest.measureValue
        )
        measureRepository.save(dbMeasure)
    }

}
