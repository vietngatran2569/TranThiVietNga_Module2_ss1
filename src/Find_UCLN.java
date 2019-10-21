import java.util.Scanner;

public class Find_UCLN {
    public static void main(String[] args) {
        int numberOne,numberTwo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number 1: ");
        numberOne=sc.nextInt();
        System.out.println("Input number 2: ");
        numberTwo=sc.nextInt();

        numberOne=Math.abs(numberOne);
        numberTwo=Math.abs(numberTwo);

        if(numberOne==0||numberTwo==0){
            System.out.println("No greatest common factor");
        }
        while (numberOne!=numberTwo){
            if (numberOne>numberTwo){
                numberOne=numberOne-numberTwo;
            }else {
                numberTwo=numberTwo-numberOne;
            }
        }
        System.out.println("Greatest common factor: " + numberOne);
    }
}
