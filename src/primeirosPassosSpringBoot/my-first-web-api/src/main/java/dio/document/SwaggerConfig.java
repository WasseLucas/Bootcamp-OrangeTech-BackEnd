package dio.document;

import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI informacoesApi() {
    return new OpenAPI()
            .info(new Info()
                    .title("Title - Rest Api")
                    .description("API exempro de uso SpringBoot REST API")
                    .termsOfService("Termo de uso: Open Source")
                    .license(new License().name("Sua empresa").url("http://www.seusite.com.br"))
            );
  }

  @Bean
  public GroupedOpenApi publicApi() {
    return GroupedOpenApi.builder()
            .group("spring-rest")
            .pathsToMatch("/dio/**")
            .build();

  }
}