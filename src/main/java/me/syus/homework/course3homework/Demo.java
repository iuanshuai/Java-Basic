package me.syus.homework.course3homework;

import org.springframework.context.annotation.Bean;

public class Demo {
    @Bean(name = "company")
    public Company getCompany() {
        Address address = new Address("422 St", 12);
        Company company = new Company(address);
        return company;
    }
}
