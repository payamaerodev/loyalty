package com.hamrasta.management.user.model.interfaces;

import com.hamrasta.management.user.constant.UserGender;

public interface IUser {
    String getId();

    void setId(String id);

    UserGender getGender();

    void setGender(UserGender gender);
}
