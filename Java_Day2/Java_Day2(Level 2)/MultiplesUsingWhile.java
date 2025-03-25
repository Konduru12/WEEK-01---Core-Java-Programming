import java.util.Scanner;
class MultiplesUsingWhile {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num <= 0 || num >= 100) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Multiples of " + num + " below 100:");
            int counter = num;
            while (counter < 100) {
                System.out.println(counter);
                counter += num; 
            }
        }
        
    }
}
}
