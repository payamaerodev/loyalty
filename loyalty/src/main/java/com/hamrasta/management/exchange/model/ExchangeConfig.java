package com.hamrasta.management.exchange.model;

import com.hamrasta.management.common.constants.TokenKind;
import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "t_exchange_config")
public class ExchangeConfig extends BaseEntity {

    @Column(name = "src_token_id")
    private String srcTokenId;

    @Column(name = "src_token")
    @Enumerated(EnumType.STRING)
    private TokenKind srcToken;

    @Column(name = "dest_token_id")
    private Integer destTokenId;

    @Enumerated(EnumType.STRING)
    @Column(name = "dest_token")
    private TokenKind destToken;

    @Column(name = "rate", precision = 38, scale = 8)
    private BigDecimal rate;

    @Column(name = "commission", precision = 38, scale = 8)
    private BigDecimal commission;

    public String getSrcTokenId() {
        return srcTokenId;
    }

    public void setSrcTokenId(String srcTokenId) {
        this.srcTokenId = srcTokenId;
    }

    public TokenKind getSrcToken() {
        return srcToken;
    }

    public void setSrcToken(TokenKind srcToken) {
        this.srcToken = srcToken;
    }

    public Integer getDestTokenId() {
        return destTokenId;
    }

    public void setDestTokenId(Integer destTokenId) {
        this.destTokenId = destTokenId;
    }

    public TokenKind getDestToken() {
        return destToken;
    }

    public void setDestToken(TokenKind destToken) {
        this.destToken = destToken;
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

}

