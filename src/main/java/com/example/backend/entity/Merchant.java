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
public class Merchant {
    @Id
    @GeneratedValue

    private int merchant_id;
    private String merchant_name;
    private String phone_number;
    private String email;
    private String password;
    private String company_name;
    private String type_of_business;

}
