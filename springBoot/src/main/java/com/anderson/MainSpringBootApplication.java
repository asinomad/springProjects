package com.anderson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableAutoConfiguration
public class MainSpringBootApplication {

    /*
    @Bean
    public SpringLiquibase liquibase(DataSource dataSource){
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/liquibase/master-changelog.xml");
        liquibase.setDataSource(dataSource);
        return liquibase;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(MainSpringBootApplication.class, args);
    }
}

