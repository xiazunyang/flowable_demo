package com.hedou.business.loan

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LoanRequestService {

    @Autowired
    private lateinit var loanRequestRepository: LoanRequestRepository

    fun newLoanRequest(customerName: String, amount: Long): LoanRequest {
        val loanRequest = LoanRequest(customerName, amount)
        return loanRequestRepository.save(loanRequest)
    }

    fun findAll(): List<LoanRequest> {
        return loanRequestRepository.findAll()
    }

}