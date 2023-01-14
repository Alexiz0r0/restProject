package com.example.restProject;

import com.example.restProject.entity.Client;
import com.example.restProject.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class ClientRepositoryTest {
    @Autowired private ClientRepository repo;

    @Test
    public void testAddNew(){
        Client client = new Client(null,"71642759","Athena","Grecia",22,"963243495","athena@gmail.com","Femenino");
        Client save = repo.save(client);

        assertThat(save).isNotNull();
        assertThat(save.getId()).isGreaterThan(0);
    }

}
