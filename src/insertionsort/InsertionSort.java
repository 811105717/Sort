package insertionsort;

/**
 * @author wuyuan
 * @version 1.0
 * @className: InsertionSort
 * @description 描述:插入排序
 * @date 2019/4/16
 */
public class InsertionSort {
    private static void insertionSort(double[] arr) {
        //i表示从第i个数开始比较,i前面的数(不包括第i个)都已经是有序的了
        for (int i = 1; i < arr.length; i++) {
            double t = arr[i];
            //j代表第i个数前面的一个数，也就是已经排好序的数的最大的那个，要把这个数插入到前面的有序序列中
            int j;
            for (j = i - 1; j >= 0 && t < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = t;
        }
    }

    public static void main(String[] args) {
        double[] arr = {2.342, 5.23, 3.983, 8.23, 7.4, 4.34, 9.1, 1.98, 3.34, 2.2, 5, 7.24, 8.09};
        InsertionSort.insertionSort(arr);
        for (double v : arr) {
            System.out.print(v + "  ");
        }
    }
}
