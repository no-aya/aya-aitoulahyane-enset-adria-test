package com.example.walletservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Wallet {
    //Wallet est définie par son id
    //(String de type UUID), son solde, sa date de création, sa devise

    @Id
    private String id;
    private double balance;
    private Date creationDate;
    private String currency;

    @ManyToOne
    private Client client;

}
