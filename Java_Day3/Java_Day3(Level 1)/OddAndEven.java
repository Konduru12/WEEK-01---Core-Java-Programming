import java.util.Scanner;
public class OddAndEven {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the natural number:");
            int number = input.nextInt();
            if(number<=0){
                System.out.println("Error,It is not a Natural number");
                System.exit(0);
            }
            int evenArr[] = new int[number/2+1];
            int oddArr[] = new int[number/2+1];
            int evenIndex = 0;
            int oddIndex = 0;
            for(int i = 1; i<number; i++){
                if(i % 2==0){
                    evenArr[evenIndex++] = i;
                }else{
                    oddArr[oddIndex++] = i;
                }
            }
            System.out.println("Even Number");
            for(int i=0; i<evenIndex; i++){
                System.out.println(evenArr[i] + "");
            }
            System.out.println("Odd Number");
            for(int i=0;i<oddIndex; i++){
                System.out.println(oddArr[i] + "");
            }
        }
    }
}
