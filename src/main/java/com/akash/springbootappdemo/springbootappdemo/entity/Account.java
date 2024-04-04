package com.akash.springbootappdemo.springbootappdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "account")
@Entity
public class Account {
    private Long id;
    private String accountHolderName;
    private double balance;
}
