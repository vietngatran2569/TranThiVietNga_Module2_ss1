package exercise;

import java.util.Scanner;

public class ChangeMoneyToUsd {
    public static void main(String[] args) {
        double vietnam,usd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Tien VND: ");
        vietnam=sc.nextDouble();
        usd=23000*vietnam;
        System.out.println("Tien Usd= "+usd);

    }
}
