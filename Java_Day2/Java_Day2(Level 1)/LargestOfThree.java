import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the First Number:");
            int num1 = input.nextInt();
            System.out.print("Enter the Secong Number:");
            int num2 = input.nextInt();
            System.out.print("Enter the Third Number:");
            int num3 = input.nextInt();
            System.out.println("Is the first number the largest? "+ (num1>num2 && num1>num3));
            System.out.println("Is the Second number the largest? "+ (num2>num1 && num2>num3));
            System.out.println("Is the Third number the largest? " + (num3>num1 && num3>num2));
            input.close();
        }
    }
}