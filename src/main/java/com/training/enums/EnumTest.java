package com.training.enums;

/**
 * Created by amanurat on 3/20/15 AD.
 */
public class EnumTest {

    public static void main(String[] args) {

//        Day usCoin = Day.SUNDAY;
//        switch (usCoin) {
//            case SUNDAY:
//                System.out.println("Today is Sunday");
//                break;
//            case MONDAY:
//                System.out.println("Today is Monday");
//                break;
//            case TUESDAY:
//                System.out.println("Today is Tuesday");
//                break;
//            case WEDNESDAY:
//                System.out.println("Today is Wednesday");
//        }


        for(Day day: Day.values()){
            System.out.println("day : " + day);
        }


//        String todayEnum = getDay(Day.FRIDAY);
//        System.out.println(todayEnum);


        System.out.println(Day.MONDAY.toString());


//        String today = getDay(1);
//        System.out.println(today);

    }

    private static String getDay(Day day) {

        return day.toString();
    }

    private static String getDay(int day) {

        if (day == 1) {
            return "Sunday";
        } else if (day == 2) {
            return "Monday";
        } else if (day == 3) {
            return "Tuesday";
        } else {
            return "don't know";
        }
    }


}

enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private int value;

    private Day(int value) {
        this.value = value;
    }


//    @Override
//    public String toString() {
//        switch(this) {
//            case FRIDAY:
//                return "Friday: " + value;
//            case MONDAY:
//                return "Monday: " + value;
//            case SATURDAY:
//                return "Saturday: " + value;
//            case SUNDAY:
//                return "Sunday: " + value;
//            case THURSDAY:
//                return "Thursday: " + value;
//            case TUESDAY:
//                return "Tuesday: " + value;
//            case WEDNESDAY:
//                return "Wednesday: " + value;
//            default:
//                return null;
//        }
//    }
}
