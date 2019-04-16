package selectionsort;

/**
 * @author wuyuan
 * @version 1.0
 * @className: SelectionSort
 * @description 描述:选择排序
 * @date 2019/4/16
 */
public class SelectionSort {
    private static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {2.342, 5.23, 3.983, 8.23, 7.4, 4.34, 9.1, 1.98, 3.34, 2.2, 5, 7.24, 8.09};
        SelectionSort.selectionSort(arr);
        for (double v : arr) {
            System.out.print(v + "  ");
        }
    }
}
