package com.hamrasta.management.user.model;

import com.hamrasta.management.user.model.interfaces.IUser;
import com.hamrasta.trellis.data.sql.model.BaseEntity;
import com.hamrasta.management.user.constant.UserGender;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User extends BaseEntity implements IUser {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserGender gender;

    @Column(length = 30,nullable = false)
    private String password;


    public UserGender getGender() {
        return gender;
    }

    public void setGender(UserGender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
