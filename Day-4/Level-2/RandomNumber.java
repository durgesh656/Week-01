import java.util.Arrays;

public class RandomNumber {

    
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit number
        }
        return randomNumbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumber statistics = new RandomNumber();

        // Generate five 4-digit random numbers
        int size = 5;
        int[] randomNumbers = statistics.generate4DigitRandomArray(size);

        // Find average, minimum, and maximum values
        double[] results = statistics.findAverageMinMax(randomNumbers);

        // Output the results
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
