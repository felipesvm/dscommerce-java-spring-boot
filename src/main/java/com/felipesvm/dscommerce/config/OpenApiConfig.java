package com.felipesvm.dscommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class OpenApiConfig {

	public static final String SECURITY_SCHEME_NAME = "bearerAuth";

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(apiInfo())
				.addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
				.components(new Components()
						.addSecuritySchemes(SECURITY_SCHEME_NAME, securityScheme()));
	}

	private Info apiInfo() {
		return new Info()
				.title("DSCommerce API")
				.description("API REST do sistema DSCommerce - cadastro de produtos, categorias, "
						+ "usuários, carrinho de compras e pedidos.")
				.version("v1.0")
				.contact(new Contact()
						.name("Felipe Santos Souza")
						.url("https://github.com/felipesvm"))
				.license(new License()
						.name("Apache 2.0")
						.url("https://www.apache.org/licenses/LICENSE-2.0"));
	}

	private SecurityScheme securityScheme() {
		return new SecurityScheme()
				.name(SECURITY_SCHEME_NAME)
				.type(SecurityScheme.Type.HTTP)
				.scheme("bearer")
				.bearerFormat("JWT")
				.in(SecurityScheme.In.HEADER)
				.description("Informe o token JWT obtido no endpoint de login (/oauth2/token), sem o prefixo 'Bearer '.");
	}
}
