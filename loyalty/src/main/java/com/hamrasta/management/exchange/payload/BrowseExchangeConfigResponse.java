package com.hamrasta.management.exchange.payload;

import com.hamrasta.trellis.core.payload.RequestMessage;

import java.math.BigDecimal;

public class BrowseExchangeConfigResponse extends RequestMessage {
    private BigDecimal rate;

    private BigDecimal commission;

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

    @Override
    public String toString() {
        return "BrowseExchangeConfigResponse{" +
                "rate=" + rate +
                ", commission=" + commission +
                '}';
    }
}
