import java.util.Scanner;
public class CounterUsingForLoop {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the Number:");
            int number = input.nextInt();
            for(int i = number ; i>=0; i--){
                System.out.println(i);
            }
            input.close();
        }
    }
}
