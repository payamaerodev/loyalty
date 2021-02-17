package com.hamrasta.management.user.payload;

import com.hamrasta.trellis.core.payload.ResponseMessage;

public class Profile extends ResponseMessage {
    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
