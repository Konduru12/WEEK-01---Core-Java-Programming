import java.util.Random;
import java.util.Scanner;

class GradeSheet{
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3]; 

        for (int i = 0; i < students; i++) {
            marks[i][0] = rand.nextInt(91) + 10; 
            marks[i][1] = rand.nextInt(91) + 10; 
            marks[i][2] = rand.nextInt(91) + 10; 
        }
        return marks;
    }
    public static double[][] calculateStats(int[][] marks) {
        double[][] stats = new double[marks.length][3]; 

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0; 
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = percentage;
        }
        return stats;
    }
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R"; 
        }
        return grades;
    }
    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f %-10s\n",
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
          }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        int[][] marks = generateMarks(students);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        displayScorecard(marks, stats, grades);
    }
}

