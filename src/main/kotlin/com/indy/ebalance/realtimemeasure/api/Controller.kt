package com.indy.ebalance.realtimemeasure.api

import com.indy.ebalance.realtimemeasure.RealTimeMeasureService
import com.indy.ebalance.realtimemeasure.db.DbRealTimeMeasure
import com.indy.ebalance.realtimemeasure.dto.NewRealTimeMeasure
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/")
class Controller(private val realTimeMeasureService: RealTimeMeasureService) {

    @PostMapping("/real-time-measure")
    fun newMeasure(@RequestBody newRealTimeMeasure: NewRealTimeMeasure): DbRealTimeMeasure {
        return realTimeMeasureService.saveRealTimeMeasure(newRealTimeMeasure = newRealTimeMeasure)
    }

}