package com.hedou.business.loan

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LoanRequestRepository : CrudRepository<LoanRequest, String>, JpaRepository<LoanRequest, String>