package by.etc.basicsofoop.task3;


/**
 * Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходых и праздничных днях.
 */

public class Main {

    public static void main(String[] args) {
        CalendarView view = new CalendarView();
        Calendar calendar = new Calendar(31, 12, 2019, null);
        Calendar calendar2 = new Calendar(2, 1, 2020, null);
        Calendar.Holiday holiday = calendar.new Holiday("New Year", "about New Year");
        calendar.setHoliday(holiday);

        view.printHolidayInfo(calendar);
        view.printHolidayInfo(calendar2);
    }
}
