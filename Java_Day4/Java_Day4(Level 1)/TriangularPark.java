import java.util.Scanner;
public class TriangularPark{
    public static int calculateRounds(double side1, double side2, double side3, double totalDistance) {
        double perimeter = side1 + side2 + side3;  
        return (int) Math.ceil(totalDistance / perimeter); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        double totalDistance = 5000; 
        int rounds = calculateRounds(side1, side2, side3, totalDistance);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
    }
}
