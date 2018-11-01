package com.anderson;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import com.anderson.config.IntegrationConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainSpringBootApplication.class)
@ContextConfiguration(classes = {IntegrationConfig.class})
@ActiveProfiles("test")
public class MainSpringBootApplicationTest {

    @Test
    public void contextLoads() {

    }
}
