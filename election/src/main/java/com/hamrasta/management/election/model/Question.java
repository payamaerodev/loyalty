package com.hamrasta.management.election.model;

import com.hamrasta.trellis.data.sql.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_question")
public class Question extends BaseEntity {
    @Column(name = "number")
    private Integer number;

    @Column(name = "question_content")
    private String questionContent;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
