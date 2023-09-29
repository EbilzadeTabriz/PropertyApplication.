package www.Property.property.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class DocumentationConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Documented by Ebilzade Tebriz")
                        .version("0.0.1")
                        .description("Writen for property.az ")
                        .contact(new Contact()
                                .name("Ebilzade Tebriz")
                                .url("www.property.az")
                                .email("ebilzadetebriz99@gmail.com"))
                        );
    }

}
