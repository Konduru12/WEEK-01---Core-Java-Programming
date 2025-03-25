import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;  
        int originalNumber = number;  
        int digit;  
        while (originalNumber != 0) {
            digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}
}
