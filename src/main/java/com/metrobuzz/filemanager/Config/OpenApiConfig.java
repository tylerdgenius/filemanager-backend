package com.metrobuzz.filemanager.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info = @Info(
        contact = @Contact(
            name = "Metrobuzz File Manager Demo", 
            email = "support@metrobuzz.com.ng", 
            url = "https://metrobuzz.com.ng"
        ),
        title = "Metrobuzz File Manager",
        description = "Metrobuzz file manager service used to demo a file manager built with Java"
    ),    
    servers = {
        @Server(
            description = "Local Environment",
            url = "http://localhost:9000"
        ),
        @Server(
            description = "Staging Environment",
            url = "https://filemanager-staging.metrobuzz.com.ng"
        ),
        @Server(
            description = "Production Environment",
            url = "https://filemanager-prod.metrobuzz.com.ng"
        )
    }
)
@SecurityScheme(
    name = "Bearer Authentication",
    description = "Jwt Auth",
    scheme = "bearer",
    type = SecuritySchemeType.HTTP,
    bearerFormat = "JWT",
    in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {

}
