package day4;

public class PrintWeekNames {
    public static void main(String[] args) {

        int weekDayNum = 7;

        if(weekDayNum == 1) 
            System.out.println("Sunday");
        else if(weekDayNum == 2) 
            System.out.println("Monday");
        else if(weekDayNum == 3) 
            System.out.println("Tuesday");
        else if(weekDayNum == 4) 
            System.out.println("Wednesday");
        else if(weekDayNum == 5) 
            System.out.println("Thursday");
        else if(weekDayNum == 6) 
            System.out.println("Friday");
        else if(weekDayNum == 7) 
            System.out.println("Saturday");
        else 
            System.out.println("Invalid Week Number");
    }
}
