package RoadToBiodome;

import java.util.ArrayList;

//시간복잡도 못구함(나중에 구하기!!!)
public class RoadToBiodome06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //배열

        int counter = 0;
        for (int i = 0; i < args.length; i++) {
            counter++;
            if (args[i].equals("/")) {
                break;
            }
            list1.add(Integer.parseInt(args[i]));
            list.add(Integer.parseInt(args[i]));
        }
        for (int i = counter; i < args.length; i++) {
            list2.add(Integer.parseInt(args[i]));
            list.add(Integer.parseInt(args[i]));
        }
        //입력받은 값 배열에 입력

        int pivot = list.get(0);
        int left = list1.get(1);
        int right = list2.get(1);
        while (left == right) {

        }
        //정렬

        System.out.println(list1 + " " + list2);
        System.out.println(list);
    }
}
