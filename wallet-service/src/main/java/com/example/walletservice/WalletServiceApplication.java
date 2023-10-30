package com.example.walletservice;

import com.example.walletservice.entities.Client;
import com.example.walletservice.entities.Wallet;
import com.example.walletservice.reps.ClientRepository;
import com.example.walletservice.reps.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class WalletServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository, WalletRepository walletRepository){
        return args -> {
            //Insertion des clients
            clientRepository.save(new Client(null,"client1","a@a.com",null));
            clientRepository.save(new Client(null,"client2","b@b.com",null));
            clientRepository.save(new Client(null,"client3","c@c.com",null));

            //Génerer UUID
            String uuid = UUID.randomUUID().toString();
            //Insertion des wallets
            List<Client> clients = clientRepository.findAll();
            clients.forEach(c->{
                walletRepository.save(new Wallet(uuid,0,new Date(),"DH",c));
            });

            System.out.println("*************");
            clientRepository.findAll().forEach(System.out::println);
            System.out.println("*************");
            walletRepository.findAll().forEach(System.out::println);

        };
    }

}
