import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the Number:");
            int Number = input.nextInt();
            if(Number > 0){
                System.out.println("Positive");
            }else if(Number < 0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
            input.close();
        }
    }
} 
