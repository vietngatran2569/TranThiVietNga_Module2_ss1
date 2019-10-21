import java.util.Scanner;

public class demoTuturior {
    public static void main(String[] args) {
        //int [] array={1,2,3,4};
        //for-each :(kieu du lieu -bien dai dien -collection)
//        for(int element: array){
//            System.out.println("element: "+element);
//        }
        //for
//        for(int i = 0; i < array.length; i++) {
//            System.out.println("element1: "+array[i]);
//        }
        //while
//        int number1=input.nextInt();
//        int number2=input.nextInt();
//        int expectedAnswer=input.nextInt();
//        while (number1+number2!=expectedAnswer){
//            System.out.println("Wrong answer!");
//                expectedAnswer=input.nextInt();
//        }
//        System.out.println("You got it");

        //do-while
        int sum=0;
        int number;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            number=scanner.nextInt();
            sum+=number;
        }while (number!=0);
        System.out.println("Sum is: "+sum);

    }
}
