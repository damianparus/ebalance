package com.indy.ebalance.measure.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {

    @GetMapping("/measures")
    fun measures(): String {
        return "web/measures"
    }

}
