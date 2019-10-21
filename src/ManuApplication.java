import java.util.Scanner;

public class ManuApplication {
    public static void main(String[] args) {
        int choice=-1;
        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1.Draw  the triangle ");
            System.out.println("2.Draw the rectangle");
            System.out.println("3.Draw the square");
            System.out.println("0.Exit ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your number:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("********");
                    System.out.println("********");
                    System.out.println("********");
                    break;
                case 3:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
