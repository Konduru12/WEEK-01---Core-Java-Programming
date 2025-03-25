import java.util.Scanner;
public class Counter {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the Number:");
            int number = input.nextInt();
            while(number>=1){
                System.out.println(number);
                number--;
            }
            input.close();
        }
    }
}
