package com.indy.ebalance.device.realtimemeasure

import org.springframework.stereotype.Component

@Component
class RealTimeMeasureService(private val realTimeMeasureRepository: RealTimeMeasureRepository) {

    fun saveRealTimeMeasure(realTimeMeasure: RealTimeMeasure) {
        realTimeMeasureRepository.save(realTimeMeasure)
    }

}
