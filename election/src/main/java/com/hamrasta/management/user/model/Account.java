package com.hamrasta.management.user.model;

import com.hamrasta.management.exchange.model.Exchange;
import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(name = "t_account")
public class Account extends BaseEntity {
    @Column(name = "password")
    private String password;

    @Column(name = "user_id")
    private Integer userId;


    @Column(name = "token_id")
    private Integer tokenId;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "blocked_balance")
    private BigDecimal blockedBalance;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "src_account_id")
    private Set<Exchange> exchanges;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBlockedBalance() {
        return blockedBalance;
    }

    public void setBlockedBalance(BigDecimal blockedBalance) {
        this.blockedBalance = blockedBalance;
    }


}

