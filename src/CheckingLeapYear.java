import java.util.Scanner;

public class CheckingLeapYear {
    public static void main(String[] args) {
        int leapYear;
        Scanner sc=new Scanner(System.in);
        leapYear=sc.nextInt();

        if (leapYear%4==0){
            if (leapYear%100!=0){
                System.out.println(leapYear+ "is leap year");
            }else{
                if (leapYear%400==0){
                    System.out.println(leapYear+"is leap year");
                }else {
                    System.out.println(leapYear+"isn't leap year");
                }
            }
        }else {
            System.out.println(leapYear+ "isnt leap year");
        }
    }
}
