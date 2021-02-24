package com.hamrasta.management.election.model;

import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_election")
public class Vote extends BaseEntity {
    @Column(name = "voter_id")
    private String voterId;

    @Column(name = "content")
    private String content;

    @Column(name = "validated")
    private String validated;

    @Column(name = "verified")
    private Date verified;

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getValidated() {
        return validated;
    }

    public void setValidated(String validated) {
        this.validated = validated;
    }

    public Date getVerified() {
        return verified;
    }

    public void setVerified(Date verified) {
        this.verified = verified;
    }
}
