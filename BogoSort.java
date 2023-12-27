package Sortieralgorithmen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BogoSort {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        boolean sorted1 = false;


        for (int i = 0; i < 7 ; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println("Vor dem Sortieren");
        numbers.forEach(i -> System.out.println(i));

        while(!sorted1){
            Collections.shuffle(numbers);
            for (int i = 0; i < numbers.size() - 1 ; i++) {
                if(numbers.get(i) > numbers.get(i + 1)){
                    sorted1 = false;
                    break;
                }
                sorted1 = true;
            }
        }


        System.out.println("Nach dem Sortieren");
        numbers.forEach(i -> System.out.println(i));

    }
    public static boolean sorted(List<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) > list.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}
