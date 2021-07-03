package com.indy.ebalance.measure.api

import com.indy.ebalance.measure.MeasureService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/")
class ApiController(private val measureService: MeasureService) {

    @PostMapping("/measures")
    fun newMeasure(@RequestBody newMeasureRequest: NewMeasureRequest): NewMeasureResponse {
        measureService.newMeasure(newMeasureRequest = newMeasureRequest)
        return NewMeasureResponse(
            status = NewMeasureResponseStatus.OK,
            request = newMeasureRequest
        )
    }

}
