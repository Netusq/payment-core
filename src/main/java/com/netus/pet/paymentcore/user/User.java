package com.netus.pet.paymentcore.user;

import com.netus.pet.paymentcore.account.Account;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private LONG id;

    @OneToMany
    private List<Account> accounts;

}
