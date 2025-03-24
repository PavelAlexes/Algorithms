package MaximumMinimumAndAverageValues;

// Заполните массив случайными числами и выведите максимальное, минимальное и среднее значение.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            sum += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.printf("sum: " + "%.2f%n", sum);
        System.out.println("max: " + Arrays.stream(arr).max().getAsInt() + " ");
        System.out.println("min: " + Arrays.stream(arr).min().getAsInt() + " ");
        System.out.printf("avg: " + "%.2f%n%n", (sum / arr.length));

    }
}
