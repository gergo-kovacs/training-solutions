package controlselection.month;


public class DayInMonth {

    public int numberOfDays(int year, String month) {

        String[] monthArray = {"január", "február", "március", "április", "május", "június", "július", "augusztus", "szeptember", "október", "november", "december"};
        int day=0;
        int m=0;

        boolean leapYear=false;

        if(year%400==0){
            leapYear=true;
        }
        if(year%4==0 && year%100!=0){

            leapYear=true;
        }

        month = month.toLowerCase();
        for (int i = 0; i < monthArray.length; i++) {
            if (monthArray[i].equals(month)) {
                m = i+1;
            }
        }

        switch (m) {
            case 1:
                day = 31;
                break;
            case 2:
               if(leapYear==true){
                   day=29;
               }else{
                   day=28;
               }
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
            case 5:
                day = 31;
                break;
            case 6:
                day = 30;
                break;
            case 7:
                day = 31;
                break;
            case 8:
                day = 31;
                break;
            case 9:
                day = 30;
                break;
            case 10:
                day = 31;
                break;
            case 11:
                day = 30;
                break;
            case 12:
                day = 31;
                break;

            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
        return day;
    }
}