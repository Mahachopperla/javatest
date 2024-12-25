import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the range (e.g., 12 to 200): ");
        String input = scanner.nextLine();
        String[] parts = input.split("to");
        int start = Integer.parseInt(parts[0].trim());
        int end = Integer.parseInt(parts[1].trim());

        // Validate range
        if (start >= end) {
            System.out.println("Invalid range. Please ensure the start is less than the end.");
            return;
        }

        // Generate 12 unique random numbers
        HashSet<Integer> randomNumbers = new HashSet<>();
        Random random = new Random();

        while (randomNumbers.size() < 12) {
            int randomNumber = random.nextInt(end - start + 1) + start;
            randomNumbers.add(randomNumber);
        }

        // Output the random numbers
        System.out.println("12 Random Numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
    }
}
