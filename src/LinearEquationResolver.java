import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bai tap giai phuong trinh bac nhat");
        System.out.println("Phuong trinh co dang ax+b=0");
        System.out.println("Nhập vào tham số a: ");
        a=scanner.nextFloat();
        System.out.println("Nhập vào tham số b: ");
        b=scanner.nextFloat();

        if (a==0){
            if (b==0){
                System.out.println("Phương trình vô SỐ nghiệm");
            }else{
                System.out.println("Phương trinh vô nghiệm");
            }
        }else {
            System.out.println("Nghiệm duy nhất của phương trình là :"+ (-b/a));
        }
    }
}
