package dio.springdatajpa;

import dio.springdatajpa.model.User;
import dio.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component("StartaApp")
public class StartaApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

    }
    private void insertUser() {
        User user = new User();
        user.setName("GABRIEL NUNES");
        user.setUserName("gabriel");
        user.setPassword("santos");
        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
