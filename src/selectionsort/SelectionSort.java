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
        for (int i = 0; i < arr.length; ++i) {
            //记录下当前的最小值
            double min = arr[i];
            //记录下当前最小值的下标
            int temp = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < min) {
                    min = arr[j];
                    temp = j;
                }
            }
            arr[temp] = arr[i];
            arr[i] = min;
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
