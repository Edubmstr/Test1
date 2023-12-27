package Sortieralgorithmen;

import Sortieralgorithmen.Merge;

import java.util.Random;

public class MergeSort extends Merge {
    public static void main(String[] args){
        int[] numbers = new int[15];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Vor dem Sortieren:");
        print(numbers);

        mergeSort(numbers);

        System.out.println("Nach dem Sortieren");
        print(numbers);
    }
}
