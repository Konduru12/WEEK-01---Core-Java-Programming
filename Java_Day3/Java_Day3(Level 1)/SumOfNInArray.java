import java.util.Scanner;
public class SumOfNInArray{
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        try(Scanner input = new Scanner(System.in)){
        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            if (number <= 0 || index >= 10) {
                break; 
            }
            numbers[index] = number;
            index++;
        }
        System.out.println("\nThe numbers entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("\nThe sum of all numbers is: " + total);
        input.close();
    }
}
}
