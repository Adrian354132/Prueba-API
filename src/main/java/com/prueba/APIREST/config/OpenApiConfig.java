package com.prueba.APIREST.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Procesamiento de Texto")
                        .version("1.0.0")
                        .description("API REST para procesar texto según los requerimientos de la prueba técnica.")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")));
    }
}
