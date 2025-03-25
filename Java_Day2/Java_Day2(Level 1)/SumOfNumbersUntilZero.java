import java.util.Scanner;
class SumOfNumbersUntilZero{
    public static void main(String[] args){
        try(Scanner input=new Scanner(System.in)){
        double total=0.0;
        System.out.println("Enter numbers to be added: ");
        while (true) { 
            System.out.print("Enter number to add: ");
            double num=input.nextDouble();
            if (num<=0){
                break;
            }
            total+=num;
        }
        System.out.println("Total "+ total);
    }}}
