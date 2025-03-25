import java.util.Scanner;
public class Multiplication6to9{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter the number from 6 to 9 to print the MultiplicationTable:");
            int number = input.nextInt();
            int[] mul = new int[4];
            for (int i = 6; i <= 9; i++) {
                mul[i - 6] = number * i;
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(number + " * " + (i+6) + " = " + mul[i]);
        }
        }
    }
}
