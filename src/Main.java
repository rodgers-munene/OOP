import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        float weight = input.nextFloat();
        System.out.print("Enter height in metres: ");
        float height = input.nextFloat();
        float bmi = weight/(height * height);
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("BYE!);
    }
}
