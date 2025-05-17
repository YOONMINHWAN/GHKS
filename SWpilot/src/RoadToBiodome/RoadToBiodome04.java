package RoadToBiodome;

import java.util.ArrayList;

public class RoadToBiodome04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            list.add(Integer.parseInt(args[i]));
        }
        ArrayList<Integer> ranks = new ArrayList<>();
        for (Integer i : list) {
            ranks.add(0);
        }
        for (int i = 0; i < list.size(); i++) {
            int rank = -1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) <= list.get(i)) {
                    rank++;
                    if (list.get(i) == ranks.get(rank)) {
                        rank--;
                    }
                }
            }
            ranks.set(rank, list.get(i));
        }
        int size = ranks.size();
        while (size == 2 || size == 1) {
            size = size%2;
        }
        int put;
        if (size == 1) {
            put = (ranks.size()-1)/2;
        } else {
            put = ranks.size()/2;
        }
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            average = average + list.get(i);
        }
        System.out.println("평균값 : " + average/list.size() + ", 중앙값 : " + ranks.get(put));
    }
}
