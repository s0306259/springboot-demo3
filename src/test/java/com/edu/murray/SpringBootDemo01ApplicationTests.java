package com.edu.murray;

import com.edu.murray.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBootDemo01ApplicationTests {
    @Autowired
    private UserServiceImpl userService;

    @Test
    void testAddUser() {
        userService.addUser();
    }

    @Test
    void testDeleteUser() {
        userService.deleteUser();
    }

    @Test
    void testUpdateUser() {
        userService.updateUser();
    }

    @Test
    void testSaveUser() {
        userService.saveUser();
    }
}
