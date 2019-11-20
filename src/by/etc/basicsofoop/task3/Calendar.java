package by.etc.basicsofoop.task3;


public class Calendar {
    private int day;
    private int month;
    private int year;
    private Holiday holiday;

    public Calendar(int day, int month, int year, Holiday holiday) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.holiday = holiday;
    }

    public Calendar() {

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

    public Holiday getHoliday() {
        return holiday;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }


    class Holiday {
        private String name;
        private String info;

        public Holiday(String name, String info) {
            this.name = name;
            this.info = info;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
