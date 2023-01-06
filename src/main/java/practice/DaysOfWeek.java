package practice;


import java.util.ArrayList;

public class DaysOfWeek {


    public static String getDay(Integer dayNumber) {

        ArrayList<String> dayList = new ArrayList<>();
        dayList.add("Sunday");
        dayList.add("Monday");
        dayList.add("Tuesday");
        dayList.add("Wednesday");
        dayList.add("Thursday");
        dayList.add("Friday");
        dayList.add("Saturday");

        if (dayNumber == null) {
            System.out.println("Error");
            throw new NullPointerException();

        }
        else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {
            return dayList.get(dayNumber - 1);

        }

    }

}