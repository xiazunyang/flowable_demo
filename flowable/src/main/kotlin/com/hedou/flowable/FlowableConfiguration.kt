package com.hedou.flowable

import com.fasterxml.jackson.databind.ObjectMapper
import org.flowable.form.rest.FormRestResponseFactory
import org.flowable.rest.service.api.RestResponseFactory
import org.flowable.spring.SpringProcessEngineConfiguration
import org.flowable.spring.boot.EngineConfigurationConfigurer
import org.flowable.common.engine.impl.identity.Authentication as FlowableAuthentication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
@ComponentScan(
    basePackages = [
        "com.hedou.business",
        "com.hedou.flowable",
        "org.flowable.rest.service.api",
        "org.flowable.form.rest.service.api"
    ]
)
class FlowableConfiguration {

    @Bean
    fun restResponseFactory(objectMapper: ObjectMapper): RestResponseFactory {
        return RestResponseFactory(objectMapper)
    }

    @Bean
    fun formRestResponseFactory(): FormRestResponseFactory {
        return FormRestResponseFactory()
    }

}