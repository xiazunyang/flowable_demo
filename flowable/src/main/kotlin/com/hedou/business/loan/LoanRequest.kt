package com.hedou.business.loan

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Table
@Entity(name = "BIZ_LOAN_REQUEST")
data class LoanRequest(

    var customerName: String,

    var amount: Long,

    @Column(columnDefinition = "bit not null default 0")
    var approved: Boolean = false,

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    val id: String = ""

)