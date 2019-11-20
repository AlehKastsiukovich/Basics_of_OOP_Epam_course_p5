package by.etc.basicsofoop.task3;

public class CalendarLogic {

    public boolean isHoliday(Calendar calendar) {
        if (calendar.getHoliday() != null) {
            return true;
        }

        return false;
    }
}
