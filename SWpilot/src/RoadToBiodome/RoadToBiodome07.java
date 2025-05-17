package RoadToBiodome;


import java.util.ArrayList;
import java.util.Collections;

public class RoadToBiodome07 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> animals1 = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            animals.add(args[i]);
        }
        System.out.println(animals);

        bubble(animals, animals.size());
        System.out.println(animals);
        count(animals, animals1, animals.size());
        System.out.println(animals);
    }
    public static void count(ArrayList<String> animals, ArrayList<String> animals1, final int size) {
    }

    //버블 정렬과 compareTo() 같이 사용하여 정렬
    public static void bubble(ArrayList<String> animals, int size) {
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (animals.get(j).compareTo(animals.get(j + 1)) > 0) {
                    swap(animals, j, j + 1);
                }
            }
        }
    }
    public static void swap(ArrayList<String> animals, int a, int b) {
        String temp = animals.get(a);
        animals.set(a, animals.get(b));
        animals.set(b, temp);
    }
}
