package insertionsort;

/**
 * @author wuyuan
 * @version 1.0
 * @className: InsertionSort
 * @description 描述:
 * @date 2019/4/16
 */
public class InsertionSort {
    private static void insertionSort(double[] arr) {
        //i表示从第i个数开始比较,i前面的数都已经是有序的了
        for (int i = 1; i <= arr.length; i++) {
            double t = arr[i], min;
            //j代表第i个数后面的一个数，要把这个数插入到前面的有序序列中
            for (int j = i + 1; j > 0; j--) {

            }
        }
    }

    public static void main(String[] args) {

    }
}
