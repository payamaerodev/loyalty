package com.hamrasta.management.user.model;

import com.hamrasta.management.user.constant.ExchangeKind;
import com.hamrasta.trellis.data.sql.model.BaseEntity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_exchange")
public class Exchange extends BaseEntity {


    @Column()
    @Enumerated
    public ExchangeKind exchange_kind ;

    @Column()
    private Integer srcAccountId;
    @Column()
    private Integer srcAmount;
    @Column()
    private Integer destAccountId;
    @Column()
    private Integer destAmount;
    @Column()
    private Double rate;
    @Column()
    private Double commission;
    @Column()
    private Boolean buy;

    @CreatedDate
    @Column()
    private Date created_date;
    @LastModifiedDate
    @Column()
    private Date modified_date;




}
