package com.indy.ebalance.device.realtimemeasure

import org.bson.types.Decimal128
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private val realTimeMeasureService: RealTimeMeasureService) {

    @PostMapping("/api/save")
    fun newMeasure(): RealTimeMeasure {
        val realTimeMeasure = RealTimeMeasure(deviceId = 1, measure = Decimal128(10), measureDate = (System.currentTimeMillis() / 1000).toInt())
        realTimeMeasureService.saveRealTimeMeasure(realTimeMeasure)
        return realTimeMeasure
    }

}
