package RoadToBiodome;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int lo = args.length;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) >= 0 && Integer.parseInt(args[i]) <= 1000) {
                list.add(Integer.parseInt(args[i]));
            } else {
                System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요!");
                return;
            }
        }

        System.out.println(list);
    }
    public static List<Integer> sub(int lo, List<Integer> list) {
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < lo; i++) {
            if (list.contains(i)) {
                counts.add(i, +1);
            }
        }
        return counts;
    }

}
