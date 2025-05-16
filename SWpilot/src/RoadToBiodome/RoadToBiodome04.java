package RoadToBiodome;

import java.util.ArrayList;

public class RoadToBiodome04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : args) {
            list.add(Integer.parseInt(s));
        }
        ArrayList<Integer> ranks = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) <= list.get(j)) {
                    rank++;
                }
            }
            ranks.add(rank, list.get(i));
        }
        System.out.println(ranks);
    }
}
