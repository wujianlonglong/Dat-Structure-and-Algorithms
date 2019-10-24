package algorithm.sort;

/**
 * <p>
 * 选择排序
 * </p >
 *
 * @author wujianlong
 * @package algorithm.sort
 * @date 2019-10-24 19:49
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Select {

    public void sort(int[] data) {
        int n = data.length;
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            int tmp = data[i];
            for (int j = i + 1; j < n; j++) {
                if (data[minIndex] > data[j]) {
                    minIndex = j;
                }
            }
            data[i] = data[minIndex];
            data[minIndex] = tmp;
        }
    }

    public static void main(String[] args){
        int[] data=new int[]{4,2,7,4,1,0,5,9};
        Select select=new Select();
        select.sort(data);
        for (int datum : data) {
            System.out.print(datum+",");
        }
    }

}
