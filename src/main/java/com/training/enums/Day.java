package com.training.enums;

public enum Day {
    SUNDAY(1, ""), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private int value;

    private Day(Integer value) {
        this.value = value;
    }


    private Day(Integer value, String a) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}