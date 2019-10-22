import java.util.Scanner;

public class InvestMoney {
    public static void main(String[] args) {
        int myMoneyRecieve;
        int interest;
        int countMonth;
        Scanner sc=new Scanner(System.in);
        System.out.println("So tien ban gui la: ");
        myMoneyRecieve=sc.nextInt();
        System.out.println("Lai suat ngan hang theo nam la: ");
        interest=sc.nextInt();
        System.out.println("So thang ban gui la: ");
        countMonth=sc.nextInt();
        System.out.println("===>> So tien ban nhan duoc la: "+myMoneyRecieve*interest/12*countMonth);

    }
}
