package com.hamrasta.management.user.model;

import com.hamrasta.management.user.constant.UserGender;
import com.hamrasta.management.user.model.interfaces.IUser;
import com.hamrasta.trellis.data.sql.model.BaseEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_token")
public class Token extends BaseEntity {


    @Column()
    private String name;
    @Column()
    private String symbol;
    @Column()
    private String description;
    @Column()
    private Double value;
    @Column()
    private Boolean blocked_balance;
    @CreatedDate
    @Column()
    private Date created_date;
    @LastModifiedDate
    @Column()
    private Date modified_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean getBlocked_balance() {
        return blocked_balance;
    }

    public void setBlocked_balance(Boolean blocked_balance) {
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
