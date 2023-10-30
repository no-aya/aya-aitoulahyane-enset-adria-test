package com.example.walletservice.dtos;

public class WalletDTO {
private Long id;
    private String name;
    private String description;
    private Long clientId;

    public WalletDTO() {
    }

    public WalletDTO(Long id, String name, String description, Long clientId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.clientId = clientId;
    }

    public WalletDTO(String name, String description, Long clientId) {
        this.name = name;
        this.description = description;
        this.clientId = clientId;
    }

    public WalletDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public WalletDTO(String name) {
        this.name = name;
    }

    public WalletDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public WalletDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


}
