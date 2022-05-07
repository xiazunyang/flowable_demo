package com.hedou.business.loan

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/business/loan")
class LoanRequestController {

    @Autowired
    private lateinit var loanRequestService: LoanRequestService

    @GetMapping
    fun findAll(): List<LoanRequest> {
        return loanRequestService.findAll()
    }

}