package com.elis.pricing.appsecurity.service;

import com.elis.pricing.appsecurity.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
@Transactional
public class UserServiceIntegrationTest {
    @Autowired
    private UserService service;

    @Test
    public void signup() {
        Optional<User> brieu = service.signup("brieu", "brieu", "brieu", "brieu");
        assertThat(brieu.get().getPassword(), not("brieu"));
        System.out.println("Encoded Password = " + brieu.get().getPassword());

    }
}