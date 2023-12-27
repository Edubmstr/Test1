package Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort2 {
    public static void main(String[]args){
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(100);
        }

        //System.out.println("Vor dem Sortieren: ");
        //for (int i = 0; i < numbers.length; i++) {
        //    System.out.println(numbers[i]);
        //}
        System.out.println(Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int [] numbers){
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int indexMin = i;
            for (int j = i + 1; j < length; j++) {
                if(numbers[j] < min){
                    min = numbers[j];
                    indexMin = j;
                }
            }
            swap(numbers, i, indexMin);
        }
    }

    private static void swap(int[] numbers, int i, int indexMin) {
        int temp = numbers[i];
        numbers[i] = numbers[indexMin];
        numbers[indexMin] = temp;
    }
}
