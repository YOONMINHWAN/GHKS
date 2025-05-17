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

        quickSort(list, 0,list.size()-1);
        System.out.println(list1 + " " + list2);
        System.out.println(list);

        double median = 0;
        double mean = 0;
        if (list.size() % 2 == 0) {
            median = (double)(list.get((list.size() - 1) / 2) + list.get(list.size() / 2)) /2;
        } else {
            median = (double)list.get(list.size()/2);
        }
        for (int i = 0; i < list.size(); i++) {
            mean += (list.get(i));
        }
        mean = mean / list.size();
        double rounded = (double) (int) (mean * 10 + 0.5) / 10;
        System.out.println("-> Median: " + median + ", Mean: " + rounded);
    }
    public static void quickSort(ArrayList<Integer> list, int left, int right) {
        if (left >= right) return;

        int pivot = list.get((left + right) / 2);
        int index = partition(list, left, right, pivot);
        quickSort(list, left, index - 1);
        quickSort(list, index, right);
    }
    public static int partition(ArrayList<Integer> list, int left, int right, int pivot) {
        while (left <= right) {
            while (list.get(left) < pivot) left++;
            while (list.get(right) > pivot) right--;

            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return left;
    }
}
