package main;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {

        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int parseDay(String str) {

        int day = Integer.parseInt(str) % 100;
        return day;

    }

    public static int parseMonth(String str) {

        str = str.substring(0, str.length() - 2);
        int month = Integer.parseInt(str) % 100;
        return month;

    }

    public static int parseYear(String str) {

        int year = Integer.parseInt(str.substring(0, str.length() - 4));
        return year;

    }

    public static Date getDate(String str) {

        int day = Integer.parseInt(str) % 100;
        str = str.substring(0, str.length() - 2);
        int month = Integer.parseInt(str) % 100;
        int year = Integer.parseInt(str.substring(0, str.length() - 2));

        Date date = new Date (day,month,year);

        return date;

    }
}
