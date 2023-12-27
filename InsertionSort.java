package Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[]args){
        int[] numbers = new int[10];
        Random random = new Random();
        int temp = 0;

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 1; i < numbers.length; i++) {
           temp = numbers[i];
           int j = i - 1;
            while (j >= 0 && numbers[j] > temp){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = temp;
        }

        String output = Arrays.toString(numbers);
        System.out.println(output);
    }
}
