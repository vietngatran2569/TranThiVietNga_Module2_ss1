import java.util.Scanner;

public class MonthOfDay {
    public static void main(String[] args) {
        int month;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao thang: ");
        month=sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month has 31 days");
                break;
            case 2:
                System.out.println("Month has 28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month has 30 days");
                break;
           default:
               System.out.println("Month from 1-12");
               break;
        }
    }
}
