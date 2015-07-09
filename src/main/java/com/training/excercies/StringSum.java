package com.training.excercies;

public class StringSum {
    public int add(String str1, String str2) {


        return parseNumber(str1) + parseNumber(str2);
    }

    private int parseNumber(String str) {
        int num = 0;
        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException ignored) {

        }
        return num;
    }
}
