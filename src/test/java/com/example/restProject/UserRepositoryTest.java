package com.example.restProject;

import com.example.restProject.entity.User;
import com.example.restProject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    public void newUserTest(){
        User user = new User();
        user.setUserName("Baji");
        user.setUserPassword("842");

        User save = repository.save(user);

        assertThat(save).isNotNull();
        assertThat(save.getId()).isGreaterThan(0);
    }

    @Test
    public void newTokenTest(){
        User user = new User();
        user.setUserName("Kisaki");
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("password");
        user.setUserPassword(password);

        User save = repository.save(user);

        assertThat(save).isNotNull();
        assertThat(save.getId()).isGreaterThan(0);
    }
}
