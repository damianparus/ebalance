package com.indy.ebalance.measure.api

import com.indy.ebalance.measure.Measure
import com.indy.ebalance.measure.MeasureService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/")
class ApiController(private val measureService: MeasureService) {

    @GetMapping("/measures")
    fun measuresList(): MeasuresListResponse {
        return MeasuresListResponse(
            items = measureService.findAll()
        )
    }

    @PostMapping("/measures")
    fun newMeasure(@RequestBody newMeasure: Measure): NewMeasureResponse {
        measureService.newMeasure(measure = newMeasure)
        return NewMeasureResponse(
            request = newMeasure
        )
    }

}
