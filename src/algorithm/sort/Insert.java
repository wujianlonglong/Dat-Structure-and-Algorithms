package algorithm.sort;

/**
 * <p>
 * 插入排序
 * </p >
 *
 * @author wujianlong
 * @package algorithm.sort
 * @date 2019-10-24 17:29
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Insert {

    public void sort(int[] data) {
        int n = data.length;
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int value = data[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                int m = data[j];
                if (value > m) {
                    break;
                } else {
                    data[j + 1] = m;
                }
            }
            data[j + 1] = value;
        }
    }

    public static void main(String[] args){
        int[] data=new int[]{4,2,7,4,1,0,5,9};
        Insert insert=new Insert();
        insert.sort(data);
        for (int datum : data) {
            System.out.print(datum+",");
        }
    }


}
