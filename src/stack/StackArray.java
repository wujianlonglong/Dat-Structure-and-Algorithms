package stack;

import java.lang.reflect.Array;

/**
 * <p>
 * 基于数组实现的栈
 * </p >
 *
 * @author wujianlong
 * @package stack
 * @date 2019-08-24 16:05
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class StackArray<T> {

    private T[] array;

    /**
     * 栈的大小
     */
    private int n;

    /**
     * 数组中元素数量
     */
    private int count;


    /**
     * 初始化一个n大小的数组
     *
     * @param n
     * @param tClass
     */
    public StackArray(int n, Class<T> tClass) {
        array =   (T[]) Array.newInstance(tClass, n);
        this.n = n;
        count = 0;
    }


    /**
     * 清空栈元素
     */
    public void cleanAll(){
        array = (T[]) Array.newInstance(array.getClass(), n);
        count = 0;
    }

    /**
     * 入栈
     *
     * @param object
     * @return
     */
    public boolean push(T object) {
        //栈已满
        if (count == n) {
            return false;
        }
        array[count] = object;
        count++;
        return true;
    }

    /**
     * 出栈
     *
     * @return
     */
    public T pop() {
        if (count == 0) {
            return null;
        }
        T object = array[count - 1];
        count--;
        return object;
    }

    /**
     * 打印栈顶元素
     */
    public void printHead(){
        if(count==0){
            System.out.println("当前栈为空！");
        }
        System.out.print("当前栈元素：");
        System.out.print(array[count-1]);
    }

    /**
     * 打印栈
     */
    public void printAll(){
        if(count==0){
            System.out.println("当前栈为空！");
        }
        System.out.print("当前栈元素：");
        for(int i=count-1;i<=0;i--){
            T object=array[i];
            System.out.print(object.toString()+",");
        }
        System.out.println("");
    }


    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        StackArray<String> stackArray=new StackArray<String>(10,String.class);
        stackArray.push("sds");
        stackArray.push("dasd");
        stackArray.push("sdsd");
        stackArray.push("eter");
        stackArray.printAll();
        stackArray.pop();
        stackArray.printAll();
        stackArray.pop();
        stackArray.printAll();
    }


}
