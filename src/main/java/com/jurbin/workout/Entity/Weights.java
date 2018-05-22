package com.jurbin.workout.Entity;

public class Weights {
    int fortyFives = 0;
    int twentyFives = 0;
    int tens = 0;
    int fives = 0;
    int twoPointFives = 0;
    int extraWeight = 0;

    String errors = "";

    public int getFortyFives() {
        return fortyFives;
    }

    public void setFortyFives(int fortyFives) {
        this.fortyFives = fortyFives;
    }

    public int getTwentyFives() {
        return twentyFives;
    }

    public void setTwentyFives(int twentyFives) {
        this.twentyFives = twentyFives;
    }

    public int getTens() {
        return tens;
    }

    public void setTens(int tens) {
        this.tens = tens;
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getTwoPointFives() {
        return twoPointFives;
    }

    public void setTwoPointFives(int twoPointFives) {
        this.twoPointFives = twoPointFives;
    }

    public int getExtraWeight() {
        return extraWeight;
    }

    public void setExtraWeight(int extraWeight) {
        this.extraWeight = extraWeight;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
}
