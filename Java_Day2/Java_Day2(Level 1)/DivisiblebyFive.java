import java.util.Scanner;
public class DivisiblebyFive{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the Number:");
            int number = input.nextInt();
            if(number % 5 == 0){
                System.out.println(" Is the number " + number + " divisible by 5? " + true);
            }else{
                System.out.println("Is the number " + number + "divisible by 5? " + false);
            }
            input.close();
        }
    }
}
