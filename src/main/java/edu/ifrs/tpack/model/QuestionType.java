/**
 * @License
 * Copyright 2020 TPACK XS Application
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package edu.ifrs.tpack.model;

/**
 * Indicates the question type available
 */
public enum QuestionType {

    BINARY(0), SCALE(1), MULTIPLE(2), UNIQUE(3), YEAR(4), AGE(5), REGION(6), LABEL(7), SAVE(8), MULTILEVEL(9),
    TEXTAREA(10);

    /**
     * the value
     */
    private int value;

    QuestionType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}