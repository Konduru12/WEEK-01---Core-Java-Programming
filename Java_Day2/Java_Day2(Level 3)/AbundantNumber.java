import java.util.Scanner;
class AbundantNumber{
    public static void main(String[] args){
        try(Scanner input=new Scanner(System.in)){
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if(sum>num){
            System.out.println("Abundant number");
        }else{
            System.out.println("Not abundant number");
        }
     
    }
}
}
