package exercise;

import java.util.Scanner;

public class DrawTypes {
    public static void main(String[] args) {
        int choice;
        System.out.println("Menu: ");
        System.out.println("1.Draw  the triangle ");
        System.out.println("2.Draw the rectangle");
        System.out.println("0.Exit ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number:");
        choice = sc.nextInt();
        switch (choice) {
            case 2:
                int width, height;
                Scanner sca = new Scanner(System.in);
                System.out.println("Nhap vao chieu dai: ");
                height = sca.nextInt();
                System.out.println("Nhap vao chieu rong: ");
                width = sca.nextInt();
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 1:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}


