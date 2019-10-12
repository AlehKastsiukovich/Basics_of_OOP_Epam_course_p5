package by.etc.java.basicsofoop.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar {
    private int day;
    private int month;
    private int year;
    private boolean isHoliday;
    private static List<Holidays> holidaysList = new ArrayList<>();

    public Calendar(int day, int month, int year, boolean isHoliday) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.isHoliday = isHoliday;
    }

    public String toString() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }

    public void showHolidaysList() {
        for(Holidays hol: holidaysList) {
            System.out.println(hol.toString());
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    class Holidays {
        private Calendar calendar;
        private String info;

        public String toString() {
            return this.calendar.getDay() + "/" + this.calendar.getMonth() + "/" +
                    this.calendar.getYear() + "\n" + info + "\n" +
                    "______________________________________________________________________";
        }

        public void setCalendar(Calendar calendar) {
            this.calendar = calendar;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public void isThisHoliday(Calendar calendar, Holidays holidays) {
            Scanner scanner = new Scanner(System.in);

            if(calendar.isHoliday) {
                holidays.setCalendar(calendar);
                System.out.println("Add information about holiday "+ calendar.toString() + ": ");
                holidays.setInfo(scanner.nextLine());
                holidaysList.add(holidays);
            }
        }
    }
}
