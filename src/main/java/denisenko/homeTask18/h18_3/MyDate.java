package denisenko.homeTask18.h18_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyDate {

    Month month;
    int day;
    DayOfWeek dayOfWeek;

    MyDate(String month, int day) {
        this.month = new Month(month);
        this.day = day;
    }

    MyDate(String month, int day, DayOfWeek dayOfWeek) {
        this.month = new Month(month);
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        if (dayOfWeek != null) {
            return day + "." + month.toString() + " (" + dayOfWeek.toString() + ")";
        }
        return day + "." + month.toString();
    }



    public static class Month {
        private static final Map<Integer, String> Months = new HashMap<>() {{
            put(1, "January");
            put(2, "February");
            put(3, "March");
            put(4, "April");
            put(5, "May");
            put(6, "June");
            put(7, "July");
            put(8, "August");
            put(9, "September");
            put(10, "October");
            put(11, "November");
            put(12, "December");
        }};

        private int month;
        private String monthString;

        Month(String month) {
            this.monthString = month;
            if (Months.containsValue(month)) {
                for (Map.Entry<Integer, String> entry : Months.entrySet()) {
                    if (entry.getValue().equals(month)) {
                        this.month = entry.getKey();
                        break;
                    }
                }
            }
        }

        @Override
        public String toString() {
            return String.valueOf(month);
        }

    }


    public static class DayOfWeek {
        private static final Map<Integer, String> WeekDays = new HashMap<>() {{
            put(1, "Monday");
            put(2, "Tuesday");
            put(3, "Wednesday");
            put(4, "Thursday");
            put(5, "Friday");
            put(6, "Saturday");
            put(7, "Sunday");
        }};

        private int dayOfWeek;
        private String dayOfWeekString;

        public DayOfWeek(String dayOfTheWeek) {
            this.dayOfWeekString = dayOfTheWeek;
            if (WeekDays.containsValue(dayOfTheWeek)) {
                for (Map.Entry<Integer, String> entry : WeekDays.entrySet()) {
                    if (entry.getValue().equals(dayOfTheWeek)) {
                        this.dayOfWeek = entry.getKey();
                        break;
                    }
                }
            }

        }

        @Override
        public String toString() {
            return dayOfWeekString;
        }
    }
}

