import java.util.Scanner;
public class PosNegZero {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            int[] numbers = new int[5];
            for(int i = 0; i<numbers.length; i++){
                System.out.print("Enter the elements "+ (i+1)+ " :");
                numbers[i] = input.nextInt();
                }
            for(int i = 0; i<numbers.length; i++){
                int num = numbers[i];
                if(num>0){
                    if(num % 2==0){
                        System.out.println("The number " + num + " is positive and even.");
                    }else{
                        System.out.println("The number " + num + " is positive and Odd.");
                    }
                }else if(num<0){
                    System.out.println("The number " + num + " is negative.");
                }else{
                    System.out.println("The number " + num + " is zero.");
                }
            }
            if(numbers[0]==numbers[4]){
                System.out.println("The first and last elements are equal");
            }else if(numbers[0] > numbers[4]){
                System.out.println("The first element is greater than second element");
            }else{
                System.out.println("The first element is smaller than second element");
            }
            }
        }
    }
