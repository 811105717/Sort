package bubblesort;

/**
 * @author wuyuan
 * @version 1.0
 * @className: BubbleSort
 * @description 描述:冒泡排序
 * @date 2019/4/16
 */
public class BubbleSort {
    private static void bubbleSort(double[] arr) {
        for (int i = arr.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {2.342, 5.23, 3.983, 8.23, 7.4, 4.34, 9.1, 1.98, 3.34, 2.2, 5, 7.24, 8.09};
        BubbleSort.bubbleSort(arr);
        for (double v : arr) {
            System.out.print(v + "  ");
        }
    }
}
