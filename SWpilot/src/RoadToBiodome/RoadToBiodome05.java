package RoadToBiodome;

import java.util.ArrayList;

public class RoadToBiodome05 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        int set = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("/")) {
                set++;
                break;
            }
            l1.add(args[i]);
            set ++;
        }
        for (int i = set; i < args.length; i++) {
            l2.add(args[i]);
        }
        System.out.println(l1 + " " + l2);
        System.out.println(" ");
        //배열 나누기
        try {
            ArrayList<Integer> list = new ArrayList<>();
            for (String s : l1) {
                list.add(Integer.parseInt(s));
            }
            for (String s : l2) {
                list.add(Integer.parseInt(s));
            }
            System.out.println(list);
            //문자 배열을 정수배열로 변환

            for (Integer i : list) {
                if (i > 100 || i < 0) {
                    System.out.println("잘못된 입력값이 있습니다!");
                    return;
                }
            }
            //오류값 잡아내기

            ArrayList<Integer> ranks = new ArrayList<>();
            for (Integer i : list) {
                ranks.add(-1);
            }
            for (Integer i : list) {
                int rank = -1;
                for (Integer j : list) {
                    if (i <= j) {
                        rank++;
                        if (i == ranks.get(rank)) {
                            rank--;
                        }
                    }
                }
                ranks.set(rank, i);
            }
            System.out.println("-> " + ranks.reversed());

        } catch (Exception e) {
            System.out.println("잘못된 입력값이 있습니다!");
        }
    }
}
