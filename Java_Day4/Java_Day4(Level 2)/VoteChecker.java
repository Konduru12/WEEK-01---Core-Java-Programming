import java.util.Scanner;
public class VoteChecker{
    public boolean canStudentVote(int age){
        return age>=18;

        }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
       
        for (int i=0;i<10;i++){
            System.out.print("Enter the age of student " +(i+1)+" :");
            int age=inp.nextInt();
            VoteChecker canvote=new VoteChecker();
            boolean eligible=canvote.canStudentVote(age);

            if(eligible){
                System.out.println("The student "+(i+1)+" is eligible to vote.");
            }else{
                System.out.println("The student "+(i+1)+" is not eligible to vote.");
            }
        }
    } 
 }
