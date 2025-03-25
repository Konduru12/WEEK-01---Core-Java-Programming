import java.util.Scanner;
class Multiples{
    public static void main(String[] args){
        try(Scanner input=new Scanner(System.in)){
        System.out.print("Enter the number: ");
        int num=input.nextInt();

        if (num<0){
            System.out.println("Its a negative number");
        }else if(num>0 && num<100){
            System.out.println("Multiples of " + num + " below 100:");
            for(int i=num;i<100;i++){
                if (i%num ==0){
                    System.out.println(i);
                }
            }
        }
    }
}
}
