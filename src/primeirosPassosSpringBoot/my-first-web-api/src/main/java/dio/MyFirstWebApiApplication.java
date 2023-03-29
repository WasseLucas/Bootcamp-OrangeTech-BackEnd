package dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;



@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				contact = @Contact(
						name = "Mr Java",
						email = "seuemail@gmail.com"
				)
		)
)
public class MyFirstWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebApiApplication.class, args);
		
	}

}
