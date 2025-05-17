package RoadToBiodome;

import java.util.Arrays;

public class test {

    // 퀵 정렬 함수
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr[(left + right) / 2];  // 피벗: 중앙값
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);  // 왼쪽 정렬
        quickSort(arr, index, right);     // 오른쪽 정렬
    }

    // 분할 함수
    private static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            if (left <= right) {
                // 스왑
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    // 실행 함수
    public static void main(String[] args) {
        int[] arr = {9, 8, 1, 2, 6};

        System.out.println("정렬 전: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}