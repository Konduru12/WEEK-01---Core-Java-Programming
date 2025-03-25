import java.util.Scanner;
class GreatestFactorUsingWhile{
    public static void main(String[] args){
        try(Scanner inp=new Scanner(System.in)){
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        int greatestfactor=1;
        int counter=num-1;
        while(counter>1){
            if(num%counter==0){
                greatestfactor=counter;
                break;
            }
            counter--;
        }
        
        System.out.println("Greatest factor of " + num + " is: " + greatestfactor);
    }
}
}
