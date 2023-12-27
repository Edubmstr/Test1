package Sortieralgorithmen;

public class Merge {
    public static void print(int[] numbers){
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void mergeSort(int[] numbers){
        int halflength = numbers.length / 2;
        int[] left = new int[halflength];
        int[] right = new int[numbers.length - halflength];

        if(numbers.length < 2){
            return;
        }

        for (int i = 0; i < halflength; i++) {
            left[i] = numbers[i];
        }

        for (int i = halflength; i < numbers.length; i++) {
            right[i - halflength] = numbers[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(numbers, left, right);
    }

    public static void merge(int[] numbers, int[] left, int[] right){
        int leftLength = left.length;;
        int rightLength = right.length;
        int a =0, b = 0, c = 0;

        while (a < leftLength && b < rightLength){
            if(left[a] < right[b]){
                numbers[c] = left[a];
                a++;
            }else{
                numbers[c] = right[b];
                b++;
            }
            c++;
        }
        while(a < leftLength){
            numbers[c] = left[a];
            c++;
            a++;
        }
        while(b < rightLength){
            numbers[c] = right[b];
            b++;
            c++;
        }
    }
}
