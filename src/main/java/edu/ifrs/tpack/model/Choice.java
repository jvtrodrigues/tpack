/**
 * @License
 * Copyright 2020 TPACK XS Application
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package edu.ifrs.tpack.model;

import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 * Choice Entity
 */
@Entity
public class Choice {

    /**
     * the identifier
     */
    @Id
    @GeneratedValue
    private long id;

    /**
     * the text of choice
     */
    private String text;

    /**
     * the question related
     */
    @ManyToOne
    private Question question;

    /**
     * the list of answers related
     */
    @OneToMany(mappedBy = "choice", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JsonbTransient
    private List<Answer> answers;

    /**
     * used just for multilevel questions
     */
    private byte level;

    /**
     * jumps for this level when user choose this choice
     */
    private byte nextLevel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @JsonbTransient
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public byte getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(byte nextLevel) {
        this.nextLevel = nextLevel;
    }

}
