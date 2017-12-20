package math;

public class ShellSort {
    public static void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2){
            for (int i = 0; i < arr.length; i = i + gap){
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && temp < arr[j-gap]; j -= gap){
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6};
        shellSort(arr);
        System.out.println(arr[1]);
    }
}
