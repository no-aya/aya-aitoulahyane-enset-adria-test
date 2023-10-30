package com.example.walletservice.dtos;

public class ClientDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone=phone;
    }

    public ClientDTO(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone=phone;
    }

    public ClientDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public ClientDTO(String name) {
        this.name = name;
    }

    public ClientDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClientDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
