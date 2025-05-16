package RoadToBiodome;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        for (String s : args) {
            input.add(Integer.parseInt(s));
        }

        ArrayList<Integer> ranks = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            int rank = 1; // 1등부터 시작
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i) < input.get(j)) {
                    rank++;
                }
            }
            ranks.add(rank);
        }

        System.out.println(ranks);
    }
}