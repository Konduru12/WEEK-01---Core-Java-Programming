import java.util.Scanner;
class MulTable1{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=inp.nextInt();
        for(int i=6;i<9;i++){
            int total=i*num;
            System.out.println(num+" *"+i+"="+total);
        }
    }
}
