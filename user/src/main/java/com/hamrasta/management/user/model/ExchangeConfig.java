package com.hamrasta.management.user.model;

import com.hamrasta.trellis.data.sql.model.BaseEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "t_exchange_config")
public class ExchangeConfig extends BaseEntity {


    @Column()
    private String src_token_id;
    @Column()
    private Integer dest_token_id;
    @Column()
    private Double rate;
    @Column()
    private Double commission;
    @CreatedDate
    @Column()
    private Date created_date;
    @Column()
    @LastModifiedDate
    private Date modified_date;



    public String getSrc_token_id() {
        return src_token_id;
    }

    public void setSrc_token_id(String src_token_id) {
        this.src_token_id = src_token_id;
    }

    public Integer getDest_token_id() {
        return dest_token_id;
    }

    public void setDest_token_id(Integer dest_token_id) {
        this.dest_token_id = dest_token_id;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Date getCreated_date() {
        return created_date;
    }



    public Date getModified_date() {
        return modified_date;
    }




}

