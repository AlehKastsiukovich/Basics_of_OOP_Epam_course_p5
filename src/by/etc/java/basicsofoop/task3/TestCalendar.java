package by.etc.java.basicsofoop.task3;


/**
 * Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходых и праздничных днях.
 */

public class TestCalendar {

    public static void main(String[] args) {
        Calendar calendar0 = new Calendar(1,1,2020,true);
        Calendar calendar1 = new Calendar(18,7,2019,false);
        Calendar calendar2 = new Calendar(27,4,1988,true);

        Calendar.Holidays holidays0 = calendar0.new Holidays();
        Calendar.Holidays holidays1 = calendar1.new Holidays();
        Calendar.Holidays holidays2 = calendar2.new Holidays();

        holidays0.isThisHoliday(calendar0, holidays0);
        holidays1.isThisHoliday(calendar1,holidays1);
        holidays2.isThisHoliday(calendar2,holidays2);

        calendar2.showHolidaysList();
    }
}
