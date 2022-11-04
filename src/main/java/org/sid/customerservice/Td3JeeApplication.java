package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Td3JeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Td3JeeApplication.class, args);
    }
@Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"Amine","Amine@gmail.com"));
            customerRepository.save(new Customer(null,"Hamza","Hamza@gmail.com"));
            customerRepository.save(new Customer(null,"Nouaman","Nouaman@gmail.com"));
            customerRepository.findAll().forEach(c ->{
                System.out.println(c.toString());
            });
        };
    }

}
