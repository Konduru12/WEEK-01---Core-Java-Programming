import java.util.Scanner;
class OddEven{
    public static void main(String[] args){
        try(Scanner input=new Scanner(System.in)){
        System.out.print("Enter the number: ");
        int num=input.nextInt();
  if (num<0){
            System.out.println("Its a negative number");
        }else{
            for(int i=1;i<=num;i++){
                if (i%2==0){
                    System.out.println(i + " is even");
                }else{
                    System.out.println(i + " is odd");
                }
            }
        }
    }
}
}


