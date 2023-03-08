package dio.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
  @Bean
  @Scope("prototype")
  public Remetente remetente(){
    System.out.println("----------------------------------------------------------------");
    System.out.println("CRIANDO UM OBEJETO REMETENTE");
    System.out.println("----------------------------------------------------------------");
    Remetente remetente = new Remetente();
    remetente.setEmail("noreply@dio.com.br");
    remetente.setNome("Digital Innovation One");
    return remetente;
  }
  
}
