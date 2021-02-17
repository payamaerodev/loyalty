package com.hamrasta.management.user.payload;

import com.hamrasta.trellis.core.payload.ResponseMessage;

import java.util.Date;

public class GetUserProfileResponse extends ResponseMessage {
    private String id;

    private Date created;


    private Profile profile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }



    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "GetUserProfileResponse{" +
                "id='" + id + '\'' +
                ", created=" + created +
                ", profile=" + profile +
                '}';
    }
}
