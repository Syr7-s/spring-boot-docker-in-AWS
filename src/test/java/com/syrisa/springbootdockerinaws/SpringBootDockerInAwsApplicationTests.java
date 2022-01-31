package com.syrisa.springbootdockerinaws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringBootDockerInAwsApplicationTests {

    @Test
    void contextLoads() {
        Integer valueOne = 5;
        Integer valueTwo = 5;

        Assertions.assertEquals(valueOne,valueTwo);
    }

}
