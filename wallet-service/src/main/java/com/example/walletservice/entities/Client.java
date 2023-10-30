package com.example.walletservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    //Un client est
    //défini par son id (numérique auto incrémenté), son nom et son email.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Wallet> wallet;
}