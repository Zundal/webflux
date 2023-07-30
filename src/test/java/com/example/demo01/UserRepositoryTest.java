package com.example.demo01;

import com.example.demo01.dto.User;
import com.example.demo01.dto.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndRetrieveUser() {
        // given
        User user = new User();
        user.setName("John Doe");
        user.setAge(30);

        // when
        userRepository.save(user);

        // then
        User retrievedUser = userRepository.findById(user.getId()).orElse(null);
        assertEquals("John Doe", retrievedUser.getName());
        assertEquals(30, retrievedUser.getAge());
    }
}
