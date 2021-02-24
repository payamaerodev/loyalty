package com.hamrasta.management.election.model;

import com.hamrasta.management.election.constant.VoterType;
import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.*;


@Entity
@Table(name = "t_voter_list")
public class VoterList extends BaseEntity {


    @Column(name = "user_id")
    private String userId;


    @Column(name = "uuid")
    private String uuid;

    @Column(name = "vote_weight")
    private Integer voteWeight;

    @Enumerated(EnumType.STRING)
    @Column(name = "voter_type")
    private VoterType voterType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getVoteWeight() {
        return voteWeight;
    }

    public void setVoteWeight(Integer voteWeight) {
        this.voteWeight = voteWeight;
    }

    public VoterType getVoterType() {
        return voterType;
    }

    public void setVoterType(VoterType voterType) {
        this.voterType = voterType;
    }
}
