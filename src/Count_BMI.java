import java.util.Scanner;

public class Count_BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter):");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.println("Underweight");
        else if (bmi < 25.0)
            System.out.println("Normal");
        else if (bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
