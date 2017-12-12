package cn.edu.swpu.cins.learnSomethings.dataStructure.sort;

/**
 * Created by miaomiao on 17-12-3.
 */
public class QuickSort {

    private static int partition(int[] arr, int low, int heigh) {
        int base = arr[low]; //用子表的第一个记录做枢轴(分水岭)记录


        while (low < heigh)
        {
            //更改下面两个while循环中的<=和>=，即可获取到从大到小排列
            //从表的两端交替向中间扫描，从小到大排列
            while (low < heigh && arr[heigh] >= base)
            {
                heigh--;
            }
            // 如果高位小于base,把heigh位右边的都比base大
            arr[low] = arr[heigh];

            while(low < heigh && arr[low] <= base)
            {
                low++;
            }

            // 如果低位大有base,
            arr[heigh] = arr[low];
        }

        arr[low] = base;

        return low;
    }


    public static void quickSort(int[] arr,int low,int heigh) {
        if(low<heigh) {
            int division = partition(arr, low, heigh);
            quickSort(arr, low, division - 1);
            quickSort(arr, division + 1, heigh);
        }
    }

    public static void main(String[] args) {

        int[] arr = {9,3,7,4,6};
        quickSort(arr,0,arr.length-1);


        for (int i =0; i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
