package Sortieralgorithmen;

import java.util.Random;

public class ShakerSortIterativ {
    public static void main(String[] args){
        int [] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(100);
        }

        ShakerSortIterativ sort = new ShakerSortIterativ();

        System.out.println("Vor dem Sortieren:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Nach dem Sortieren:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(sort.shakerSort(numbers)[i]);
        }
    }

    public int[] shakerSort(int[] numbers){
        boolean swapped = true;
        int[] numberToSort = new int[numbers.length];
        int end = numberToSort.length;
        int start = 0;
        for (int i = 0; i < numbers.length; i++) {
            numberToSort[i] = numbers[i];
        }

        while(swapped){
            swapped = false;

            for (int j = start; j < end - 1; j++) {
                if (numberToSort[j] > numberToSort[j + 1]) {
                    int temp = numberToSort[j];
                    numberToSort[j] = numberToSort[j + 1];
                    numberToSort[j + 1] = temp;
                    swapped = true;
                }
            }

                if(swapped == false){
                    return numberToSort;
                }

                end--;

                for (int k = end - 1; k > start; k--) {
                    if(numberToSort[k] < numberToSort[k - 1]){
                        int temp = numberToSort[k];
                        numberToSort[k] = numberToSort[k - 1];
                        numberToSort[k - 1] = temp;
                        swapped = true;
                    }
                }
                start++;
            }
        return null;
    }
}
