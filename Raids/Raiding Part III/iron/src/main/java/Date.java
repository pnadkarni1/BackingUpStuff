public class Date {

    private int year;
    private String month;
    private int day;

    public Date() {

     year = 2021;
     month = "November";
     day = 29;

    }

    public Date (int dYear, String dMonth, int dDay) {

        year = dYear;
        month = dMonth;
        day = dDay;

    }

    public int setYear () {

        return year;

    }

    public String setMonth () {

        return month;

    }


    public int setDay () {

        return day;

    }

    public void getYear (int dYear) {

        year = dYear;

    }

    public void getMonth (String dMonth) {

        month = dMonth;

    }

    public void getDay (int dDay) {

        day = dDay;

    }

    @Override

    public String toString () {

        return "The Date is " + month + " " + day + ", " + year;

    }
}
