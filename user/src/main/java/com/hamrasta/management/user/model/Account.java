package com.hamrasta.management.user.model;

import com.hamrasta.management.user.constant.UserGender;
import com.hamrasta.management.user.model.interfaces.IUser;
import com.hamrasta.trellis.data.sql.model.BaseEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "t_account")
public class Account extends BaseEntity {


    @Column()
    private String password;
    @Column()
    private Integer user_id;
    @Column()
    private Integer token_id;
    @Column()
    private Double balance;
    @Column()
    private Double blocked_balance;
    @CreatedDate
    @Column()
    private Date created_date;
    @Column()
    @LastModifiedDate
    private Date modified_date;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getToken_id() {
        return token_id;
    }

    public void setToken_id(Integer token_id) {
        this.token_id = token_id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBlocked_balance() {
        return blocked_balance;
    }

    public void setBlocked_balance(Double blocked_balance) {
        this.blocked_balance = blocked_balance;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }


}

