package com.elis.pricing.appsecurity.repo;


import com.elis.pricing.appsecurity.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    public void testFindByUsername() {
        Optional<User> user = repository.findByUsername("admin");
        assertTrue(user.isPresent());

        user = repository.findByUsername("nobody");
        assertFalse(user.isPresent());
    }
}