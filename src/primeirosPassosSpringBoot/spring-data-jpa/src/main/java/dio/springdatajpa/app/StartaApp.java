package dio.springdatajpa.app;

import dio.springdatajpa.model.User;
import dio.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class StartaApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Wasse Lucas");
        user.setUserName("wassejp");
        user.setPassword("wasselucas01");

        repository.save(user);

        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
