package com.indy.ebalance.measure

import com.indy.ebalance.measure.db.DbMeasure
import com.indy.ebalance.measure.db.MeasureRepository
import org.springframework.stereotype.Component

@Component
class MeasureService(val measureRepository: MeasureRepository) {

    fun newMeasure(measure: Measure) {
        val dbMeasure = DbMeasure(
            dimesionId = measure.dimesionId,
            measureTime = measure.measureTime,
            measureValue = measure.measureValue
        )
        measureRepository.save(dbMeasure)
    }

    fun findAll(): Array<Measure> {
        return measureRepository
            .findAll()
            .map { it -> Measure(
                dimesionId = it.dimesionId,
                measureTime = it.measureTime,
                measureValue = it.measureValue
            ) }
            .toTypedArray()
    }

}
