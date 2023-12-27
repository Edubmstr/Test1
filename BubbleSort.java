package Sortieralgorithmen;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main (String[]args){
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Vor dem Sortieren:");
        for(int number : numbers){
            System.out.println(number);
        }

        boolean swapped = true;

        while(swapped){
            swapped = false;
            for(int i = 0; i < numbers.length-1; i++){
                if(numbers[i] > numbers[i+1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    swapped = true;
                }

            }
        }

        //System.out.println("Nach dem Sortieren: ");
        //for(int number : numbers){
        //    System.out.println(number);
        //}
        System.out.println("Nach dem Sortieren");
        Arrays.toString(numbers);
    }
}
