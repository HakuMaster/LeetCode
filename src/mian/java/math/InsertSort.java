package math;

public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            out:
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    break out;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6,2};
        insertSort(arr);
        System.out.println(arr[1]);
    }
}
