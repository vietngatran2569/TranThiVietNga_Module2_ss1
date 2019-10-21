import java.util.Scanner;

public class Ractangle_Scanner {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input width: ");
         width=scanner.nextDouble();
        System.out.println("Input height: ");
         height=scanner.nextDouble();

        double area=width*height;
        System.out.println("Area is : "+area);
    }
}
