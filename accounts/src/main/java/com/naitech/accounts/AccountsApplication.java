package com.naitech.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.naitech.accounts.controller") })
@EnableJpaRepositories("com.naitech.accounts.repository")
@EntityScan("com.naitech.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "NaiBank Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Ian Gabriel",
                        email = "tutor@naitech.com",
                        url = "https://www.naitech.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.naitech.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "NaiBank Accounts microservice REST API Documentation",
                url = "https://www.naitech.com/swagger-ui.html"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
