package com.example.experiment01.demo;

import com.example.experiment01.demo.com.example.experiment01.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Experiment01ApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void addAddressTest() {
        userRepository.addUserAdderss();
    }

}
