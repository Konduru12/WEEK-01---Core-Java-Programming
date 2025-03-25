import java.util.Scanner;
class LargeandSmallNum{
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            if (num < 0) {
                System.err.println("Error: Negative numbers are not allowed.");
                System.exit(0);
            }
            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;
            while (num != 0) {
                if (index == maxDigit) {
                    maxDigit += 10;
                    int[] temp = new int[maxDigit];
                    for(int i = 0; i < digits.length; i++) {
                        temp[i] = digits[i];
                    }
                    digits = temp;
                }
                digits[index++] = num % 10;
                num /= 10;
            }
            if (index == 0) {
                System.out.println("No digits found.");
                return;
            }
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }
            System.out.println("Digits stored in the array: ");
            for (int i = 0; i < index; i++) {
                System.out.print(digits[i] + " ");
            }
            System.out.println("\nLargest digit: " + largest);
            System.out.println("Second largest digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
        }
    }
}
