import java.util.Scanner;

//import java.util.Scanner;
//
public class demoTuturior {
 public static void main(String[] args) {
//        int [] array={1,2,3,4};
//        //for-each :(kieu du lieu -bien dai dien -collection)
//        for(int element: array){
//            System.out.println("element: "+element);
//        }
//       // for
//        for(int i = 0; i < array.length; i++) {
//            System.out.println("element1: "+array[i]);
//        }
//       // while
//        int number1=input.nextInt();
//        int number2=input.nextInt();
//        int expectedAnswer=input.nextInt();
//        while (number1+number2!=expectedAnswer){
//            System.out.println("Wrong answer!");
//                expectedAnswer=input.nextInt();
//        }
//        System.out.println("You got it");
//
//       // do-while
//        int sum=0;
//        int number;
//        Scanner scanner=new Scanner(System.in);
//        do {
//            System.out.println("Enter your number: ");
//            number=scanner.nextInt();
//            sum+=number;
//        }while (number!=0);
//        System.out.println("Sum is: "+sum);
//
//     int i=5;
//     int j=9;
//     int max=maxFunt(i,j);
//     System.out.println(max);
//
//    }
//    private static int maxFunt(int i, int j){
//     int result;
//        if (i>j){
//            result=i;
//        }else {
//            result=j;
//        }
//        return result;
     int width,height;
     Scanner sc=new Scanner(System.in);
     System.out.println("Nhap vao chieu dai: ");
     height=sc.nextInt();
     System.out.println("Nhap vao chieu rong: ");
     width=sc.nextInt();

//     for (int i=0; i <width; i++) {
//         for (int j=0; j <height ; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     for (int i = 0; i <width; i++) {
//         for (int j = 0; j <height ; j++) {
//             if (i==0 || j==0||i== width-1||j==height-1){
//                 System.out.print(" * ");
//             }else {
//                 System.out.print("   ");
//             }
//         }
//         System.out.println();
//     }
     float sum = 0;
     int subjects = 10;
     Scanner input = new Scanner(System.in);
     System.out.print( "Enter the marks for " + subjects + " subjects: ");
     for (int count = 0; count < subjects; count++) {
         float mark;
         mark = input.nextFloat();
         sum += mark;
     }
     System.out.print("Average mark = " + sum/subjects);

   }
   //Disconnected from the target VM, address: '127.0.0.1:52690', transport: 'socket'
}
