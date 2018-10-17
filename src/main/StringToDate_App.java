package main;

public class StringToDate_App {

    public static void main(String[] args) {

        String str = "20181017";

        //one way to do it
        Date date_x = new Date(Date.parseDay(str), Date.parseMonth(str), Date.parseYear(str));
        System.out.println(date_x.getDay() + "." + date_x.getMonth() + "." + date_x.getYear());

        //another way to do it
        Date date = Date.getDate(str);
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());

    }
}
