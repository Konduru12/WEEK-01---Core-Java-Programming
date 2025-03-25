import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
        System.out.print("Enter the Number:");
        int number = input.nextInt();
        if(number > 1){
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of natural numbers is:" + sum);
        } else{
            System.out.println("The number " + number + " is not a natural number");
        }
        input.close();
    }
}
}
