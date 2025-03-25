import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digits = 0;
        if (number == 0) {
            digits = 1;
        } else {
            while (number != 0) {
                number = number / 10;  
                digits++;  
            }
        }
        System.out.println("The number of digits is: " + digits);
    }
}
}
