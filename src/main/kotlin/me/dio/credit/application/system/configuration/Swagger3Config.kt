package me.dio.credit.application.system.configuration

import io.swagger.v3.core.model.ApiDescription
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.customizers.OpenApiCustomizer
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Swagger3Config {
  @Bean
  fun publicApi(): GroupedOpenApi? {
    return GroupedOpenApi.builder()
      .group("springcreditapplicationsystem-public")
      .pathsToMatch("/api/customers/**", "/api/credits/**")
      .build()
  }


  @Bean
  fun api(): OpenAPI {
    return OpenAPI().info(Info()
                    .title("Application customers and credits ")
                    .description("Application where customers can request credits")
                    .version("v1.0.0"))
  }

}