package exercise;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        String greeting;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your name: ");
        greeting=sc.nextLine();
        System.out.println("Hello "+greeting);
    }
}
