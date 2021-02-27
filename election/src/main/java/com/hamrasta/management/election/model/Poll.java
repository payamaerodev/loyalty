package com.hamrasta.management.election.model;

import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_poll")
public class Poll extends BaseEntity {
    @Column(name = "election_id")
    private String electionId;
    @Column(name = "question_id")
    private String questionId;
    @Column(name = "user_id")
    private String userId;
    
}
