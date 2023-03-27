package com.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Customer {
    @Id
    @GeneratedValue

    private int customer_id;
    private  String first_name;
    private String Last_name;
    private String address ;
    private String nic;
    private String phone_number;
    private int dob;
    private String email;
    private String username;
    private String password;

}
