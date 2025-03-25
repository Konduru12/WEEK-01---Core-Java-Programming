import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter the number to print its MultiplicationTable:");
            int number = input.nextInt();
            int mul[] = new int[10];
            for (int i = 1; i <= 10; i++) {
                mul[i - 1] = number * i;
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(number + " * " + (i + 1) + " = " + mul[i]);
        }
        }
    }
}
