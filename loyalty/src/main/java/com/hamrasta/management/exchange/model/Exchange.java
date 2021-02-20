package com.hamrasta.management.exchange.model;

import com.hamrasta.management.exchange.constant.ExchangeKind;
import com.hamrasta.management.user.model.Account;
import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_exchange")
public class Exchange extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "exchange_kind")
    private ExchangeKind exchangeKind;

    @Column(name = "src_account_id")
    private Integer srcAccountId;

    @Column(name = "src_amount")
    private Integer srcAmount;

    @Column(name = "dest_account_id")
    private Integer destAccountId;

    @Column(name = "dest_amount")
    private Integer destAmount;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "commission")
    private BigDecimal commission;

    @Column(name = "buy")
    private Boolean buy;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Account account;

    public ExchangeKind getExchangeKind() {
        return exchangeKind;
    }

    public void setExchangeKind(ExchangeKind exchangeKind) {
        this.exchangeKind = exchangeKind;
    }

    public Integer getSrcAccountId() {
        return srcAccountId;
    }

    public void setSrcAccountId(Integer srcAccountId) {
        this.srcAccountId = srcAccountId;
    }

    public Integer getSrcAmount() {
        return srcAmount;
    }

    public void setSrcAmount(Integer srcAmount) {
        this.srcAmount = srcAmount;
    }

    public Integer getDestAccountId() {
        return destAccountId;
    }

    public void setDestAccountId(Integer destAccountId) {
        this.destAccountId = destAccountId;
    }

    public Integer getDestAmount() {
        return destAmount;
    }

    public void setDestAmount(Integer destAmount) {
        this.destAmount = destAmount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Boolean getBuy() {
        return buy;
    }

    public void setBuy(Boolean buy) {
        this.buy = buy;
    }
}
