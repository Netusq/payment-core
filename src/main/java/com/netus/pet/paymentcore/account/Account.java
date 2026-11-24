package com.netus.pet.paymentcore.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Currency;

@Entity
@NoArgsConstructor
@Getter
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "account_id", nullable = false)
    private Long id;

    @Column(name = "balance", nullable = false)
    private double balance;

    @Column(name = "currency", nullable = false)
    private Currency currency;

    public Account(Currency currency) {
        this.currency = currency;
    }
}