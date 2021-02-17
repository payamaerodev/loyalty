package com.hamrasta.management.common.constants;

import com.hamrasta.trellis.util.generic.IComparable;

public enum TokenKind implements IComparable {
    HMA(0,"HAMRAH-E-AVAL"),
    MBN(1,"MOBIN-NET"),
    NAK(2,"NAGHSH-AVAL-KEIFIAT"),
    JRG(3,"JIRING");

     private  int value;
     private String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    TokenKind(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
