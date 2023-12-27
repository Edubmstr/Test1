package Sortieralgorithmen;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SelectionSort extends PrintArray {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Vor dem Sortieren:");
        PrintArray.arrayPrint(numbers);

        for (int i = 0; i < numbers.length-1; i++) {
            for (int m = i + 1; m < numbers.length; m++) {
                if (numbers[m] < numbers[i]) {
                  int temp = numbers[m];
                  numbers[m] = numbers[i];
                  numbers[i] = temp;
                }
            }
        }
        System.out.println("Geordnet");
        PrintArray.arrayPrint(numbers);
    }
}
