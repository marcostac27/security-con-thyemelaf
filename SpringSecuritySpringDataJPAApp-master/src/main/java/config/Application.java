package config;

import domain.Role;
import domain.RolesRepository;
import domain.User;
import domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "domain")
@EntityScan(basePackages = "domain")
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public CommandLineRunner demo(final UserRepository userRepository, final RolesRepository rolesRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Role role = new Role();
                role.setAuthority("ROLE_ADMIN");
                System.out.println(role.getAuthority());

                User user = new User();
                user.setUsername("u1");

                user.setPassword(new BCryptPasswordEncoder().encode("p1"));

                role = rolesRepository.save(role);

                user.setRoles(Arrays.asList(role));

                userRepository.save(user);
            }
        };
    }
}