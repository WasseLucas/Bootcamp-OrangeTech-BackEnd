package dio.document;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public Contact contato() {
        return new Contact(
            "Mr Dev",
                "http://www.mrDev.com.br",
                "mrdev@gmail.com"
        );
    }
    @Bean
    public ApiInfoBuilder informacoesApi(){ //Método para retornar informações da API
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("API exemplo de uso de SpringBoot REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso Open Source");
        apiInfoBuilder.license("Licença  - Sua Empresa");
        apiInfoBuilder.licenseUrl("http://www.mrDev.com.br");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }

    @Bean
    public Docket detalheApi(){ // Criando um documento
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

            docket
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("dio.controller"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(this.informacoesApi().build())
                    .consumes(new HashSet<String>(Arrays.asList("application/json")))
                    .produces(new HashSet<String>(Arrays.asList("application/json")));
        return docket;
    }

}