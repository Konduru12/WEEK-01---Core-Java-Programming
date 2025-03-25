import java.util.Scanner;
public class WeightStatus {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter the Weight: ");
        int Weight = scanner.nextInt();
        System.out.print("Enter the Height:");
        int Height = scanner.nextInt();
        int Convt_Height = Height/100;
        int BMI = Weight / (Convt_Height * Convt_Height);
        if (BMI <= 18.4){
            System.out.println("Underweight");
        }else if(18.5 <= BMI && BMI <= 24.9){
            System.out.println("Normal");
        }else if(25 <= BMI && BMI<= 39.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
}
