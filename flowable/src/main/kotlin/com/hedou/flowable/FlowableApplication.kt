package com.hedou.flowable

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan("com.hedou.business")
@EnableJpaRepositories("com.hedou.business")
class FlowableApplication

fun main(args: Array<String>) {
    runApplication<FlowableApplication>(*args)
}
