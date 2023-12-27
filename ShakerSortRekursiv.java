package Sortieralgorithmen;

import java.util.Random;

public class ShakerSortRekursiv {
    public static void main(String [] args){
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Vor dem Sortieren:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        ShakerSortRekursiv sort = new ShakerSortRekursiv();

        sort.shakerSort(numbers, 0, 10);

        System.out.println("Nach dem Sortieren");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public int[] shakerSort(int [] numbers, int start, int end){// mal umschreiben als Aufgabe mit kopiertem Array

        if(start >= end){
            return numbers;
        }

        for (int j = start; j < end - 1; j++) {
            if (numbers[j] > numbers[j + 1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }

        for (int k = end - 1; k > start; k--) {
            if(numbers[k] < numbers[k - 1]){
                int temp = numbers[k];
                numbers[k] = numbers[k - 1];
                numbers[k - 1] = temp;
            }
        }

        return shakerSort(numbers, start + 1, end -1);
    }
}


