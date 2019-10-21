import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int numberInput;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your number: ");
        numberInput=sc.nextInt();

        if (numberInput<2){
            System.out.println("This number isn't prime");
        }else{
            int i=2;
            boolean check=true;
            while (i<Math.sqrt(numberInput)){
                if (numberInput % i==0){
                   check=false;
                   break;
                }
                i++;
            }
            if(check){
                System.out.println(numberInput+" is prime");
            }else {
                System.out.println(numberInput+" isn't prime");
            }
        }


    }
}
