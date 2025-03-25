import java.util.Scanner;
public class VoteEligibility{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            for(int i = 0; i<10; i++){
                System.out.print("Enter the Elements " + (i+1) + ":");
                int age = input.nextInt();
                if(age < 0){
                    System.out.println("Invalid age");
                }else{
                    if(age>=18){
                        System.out.println("The student with the age " + (i+1) + " can vote");
                    }else{
                        System.out.println("The student with the age " + (i+1)+" cannot vote");
                    }
                }
            }
        }
    }
}
