import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0.0;
        try(Scanner input = new Scanner(System.in)){
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();  
            sum += heights[i];  
        }
        double meanHeight = sum / heights.length;
        System.out.println("\nThe mean height of the football team is: " + meanHeight + " meters");
        input.close();
    }
}
}
