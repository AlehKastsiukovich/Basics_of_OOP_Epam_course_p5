package by.etc.basicsofoop.task3;

public class CalendarView {

   public void printHolidayInfo(Calendar calendar) {
       if (calendar.getHoliday() != null) {
           System.out.println(calendar.getDay() + "/" + calendar.getMonth() + "/" + calendar.getYear());
           System.out.println("Name of holiday - " + calendar.getHoliday().getName());
           System.out.println("Info about this holiday: " + calendar.getHoliday().getInfo());
       } else {
           System.out.println("Today is not holiday, go to work!");
       }
   }
}
