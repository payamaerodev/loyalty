package com.hamrasta.management.election.model;

import com.hamrasta.management.election.constant.VoterType;
import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.*;


@Entity
@Table(name = "t_voter_list")
public class Voters extends BaseEntity {


    @Column(name = "user_id")
    private String userId;


    @Column(name = "uuid")
    private String uuid;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "vote_weight")
    private Integer voteWeight;

    @Enumerated(EnumType.STRING)
    @Column(name = "voter_type")
    private VoterType voterType;

}
