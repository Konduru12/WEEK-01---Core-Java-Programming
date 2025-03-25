import java.util.Scanner;
public class SmallestFrstNumber {
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
        System.out.print("Enter the Number1:");
        int num1 = input.nextInt();
        System.out.print("Enter the Number2:");
        int num2 = input.nextInt();
        System.out.print("Enter the Number3:");
        int num3 = input.nextInt();
        if (num1 > num2){
            System.out.println(" Is the first number the smallest? "+ false);
        } else if(num1 > num3){
            System.out.println(" Is the first number the smallest? "+ false);
        }else{
            System.out.println(" Is the first number the smallest? " + true);
        }
    }
}  
}
