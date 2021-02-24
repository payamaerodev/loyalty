package com.hamrasta.management.election.model;

import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_cost")
public class cost extends BaseEntity {

    @Column(name = "election_id")
    private String electionId;

    @Column(name = "cost1")
    private String cost1;

    public String getElectionId() {
        return electionId;
    }

    public void setElectionId(String electionId) {
        this.electionId = electionId;
    }

    public String getCost1() {
        return cost1;
    }

    public void setCost1(String cost1) {
        this.cost1 = cost1;
    }

    public String getCost2() {
        return cost2;
    }

    public void setCost2(String cost2) {
        this.cost2 = cost2;
    }

    public String getCost3() {
        return cost3;
    }

    public void setCost3(String cost3) {
        this.cost3 = cost3;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Column(name = "cost2")
    private String cost2;

    @Column(name = "cost3")
    private String cost3;

    @Column(name = "total")
    private String total;
}
