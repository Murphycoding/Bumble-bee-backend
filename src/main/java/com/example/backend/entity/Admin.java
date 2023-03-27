package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder

public class Admin {

    @Id
    @GeneratedValue


    private int id;
    private String first_name;
    private String last_name;
    private String user_name;
    private String password;
    private String email;
    private String role;




}
