package com.training.excercies;

public class StringRevertRecursive {

    public static final String HELLO = "Hello";
    private static int i = 0;

    public static void main(String args[]) {
        String result1 = reverseString1(HELLO);
        System.out.println("result1 : "+ result1);
        String result2 = reverseString2(HELLO);
        System.out.println("result2 : "+ result2);

        String result3 = reverseString3(HELLO);
        System.out.println("result3 : "+ result3);

        String result4 = reverseRecursiveDivide(HELLO);
        System.out.println("result4 : "+ result4);

    }

    public static String reverseString1(String str) {
        int localI = i++;
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        System.out.println("Step " + localI + ": " + str.substring(1) + " / " + str.charAt(0));
        String reversed = reverseString1(str.substring(1)) + str.charAt(0);

        System.out.println("Step " + localI + " returns: " + reversed);
        return reversed;
    }

    public static String reverseString2(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        } else {
            return "" + str.charAt(str.length() - 1) + reverseString2(str.substring(0, str.length() - 1));
        }
    }

    public static String reverseString3(String str){
        if (str.length() == 0)
            return str;

        return reverseString3(str.substring(1)) + str.charAt(0);
    }

    public static String reverseRecursiveDivide(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseRecursiveDivide(str.substring(str.length() / 2, str.length())) +
                reverseRecursiveDivide(str.substring(0, str.length() / 2));
    }


}
