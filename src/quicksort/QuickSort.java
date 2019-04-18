package quicksort;

import jdk.nashorn.internal.objects.annotations.Where;

/**
 * @author wuyuan
 * @version 1.0
 * @className: QuickSort
 * @description 描述:
 * @date 2019/4/18
 */
public class QuickSort {
    private static void quickSort(double[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left, r = right;

        //把基准数设成左面的那个数
        double temp = arr[left];

        while (l < r) {
            while (arr[r] >= temp && l < r) {
                --r;
            }
            while (arr[l] <= temp && l < r) {
                ++l;
            }
            if (l < r) {
                double t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
            }
        }
        //此时l和r是相等的

        //交换基准数和l指向的值
        arr[left] = arr[l];
        arr[l] = temp;

        //递归求左面和右面
        quickSort(arr, left, l - 1);
        quickSort(arr, r + 1, right);
    }

    public static void main(String[] args) {
        double[] arr = {2.342, 5.23, 3.983, 8.23, 7.4, 4.34, 9.1, 1.98, 3.34, 2.2, 5, 7.24, 8.09};
        QuickSort.quickSort(arr, 0, arr.length);
        for (double v : arr) {
            System.out.print(v + "  ");
        }
    }
}
