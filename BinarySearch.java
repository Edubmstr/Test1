package Sortieralgorithmen;


import java.util.ArrayList;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args){
        Random random = new Random();
        int [] numbers = new int[10];
        int target = random.nextInt(15);
        int index = 0;
        //ArrayList<Integer> numbers1 = new ArrayList<>();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(15);
        }

        MergeSort.mergeSort(numbers);

        index = binarySearch(numbers, target, 0, numbers.length - 1);
        System.out.println(index);
    }

    public static int binarySearch(int[] numbers, int target, int lowIndex, int highIndex){
        int middle = highIndex - (highIndex - lowIndex) / 2;

        if (lowIndex > highIndex){
            return -1;
        }
        if(numbers[middle] == target){
            return middle; // Zahl liegt in der Mitte des Arrays
        }
        else if(numbers[middle] < target){ // Zahl liegt in der rechten Hälfte
            return binarySearch(numbers, target, middle + 1, highIndex);
        }
        else { // Zahl liegt in der linken Hälfte
            return binarySearch(numbers, target, lowIndex, middle - 1);
        }
    }
}
