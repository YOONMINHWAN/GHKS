package RoadToBiodome;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int lo = args.length;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num >= 0 && num <= 1000) {
                list.add(num);
            } else {
                System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요!");
                return;
            }
        }

        int result = sub(lo, list);
        System.out.println(result);
    }

    public static int sub(int lo, ArrayList<Integer> list) {
        for (int i = 0; i < lo; i++) {
            int count = 0;
            for (int j = 0; j < lo; j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 0) {  // 오직 한 번만 나온 값
                return list.get(i);
            }
        }
        return -1; // 중복되지 않은 값이 없을 경우
    }
}