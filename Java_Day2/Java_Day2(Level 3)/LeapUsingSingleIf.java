import java.util.Scanner;
public class LeapUsingSingleIf {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
}
