package com.hamrasta.management.user.model;

import com.hamrasta.management.common.constants.TokenKind;
import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_token")
public class Token extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "symbol")
    private TokenKind symbol;

    @Column(name = "description")
    private String description;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "blocked_balance")
    private Boolean blockedBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TokenKind getSymbol() {
        return symbol;
    }

    public void setSymbol(TokenKind symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Boolean getBlockedBalance() {
        return blockedBalance;
    }

    public void setBlockedBalance(Boolean blockedBalance) {
        this.blockedBalance = blockedBalance;
    }


}
