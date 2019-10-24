package algorithm.sort;

/**
 * <p>
 * 冒泡排序
 * </p >
 *
 * @author wujianlong
 * @package algorithm.sort
 * @date 2019-10-24 16:54
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Bubble {


    public void sort(int[] data) {
        int n = data.length;
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            //是否有数据交换的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                int a = data[j];
                int b = data[j + 1];
                if (a > b) {
                    data[j + 1] = a;
                    data[j] = b;
                    flag = true;
                }
            }
            //没有数据交换，说明当前数组已有序，退出排序
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] data=new int[]{1,5,3,7,0,3,7,5};
        Bubble bubble=new Bubble();
        bubble.sort(data);

        for (int datum : data) {
            System.out.print(datum+",");
        }
    }

}
