package math;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        bubbleSort(arr);
        System.out.println(arr[0]);
    }
}
