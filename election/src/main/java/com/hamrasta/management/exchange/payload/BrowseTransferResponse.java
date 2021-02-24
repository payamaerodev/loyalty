package com.hamrasta.management.exchange.payload;

import com.hamrasta.trellis.core.payload.RequestMessage;

import java.math.BigDecimal;

public class BrowseTransferResponse extends RequestMessage {
    private BigDecimal rate;
    private String version;


    private BigDecimal commission;


    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }


    @Override
    public String toString() {
        return "BrowseTransferResponse{" +
                "rate=" + rate +
                ", version='" + version + '\'' +
                ", commission=" + commission +
                '}';
    }
}
