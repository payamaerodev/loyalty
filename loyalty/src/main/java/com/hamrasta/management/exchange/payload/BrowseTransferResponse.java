package com.hamrasta.management.exchange.payload;

import org.aspectj.bridge.MessageHandler;

public class BrowseTransferResponse extends MessageHandler {
    private Integer date;
    private String symbol;
    private Integer value;
    private String desc;
    private String address;

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BrowseTransferResponse{" +
                "date=" + date +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                ", desc='" + desc + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
