package com.hedou.flowable

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import springfox.documentation.annotations.ApiIgnore

@ApiIgnore
@Controller
class FlowableController {

    @GetMapping("/")
    @Suppress("SpringMVCViewInspection")
    fun swaggerPage(): String {
        return "redirect:/swagger-ui.html"
    }

}