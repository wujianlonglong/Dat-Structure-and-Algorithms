package structure.queue;

/**
 * <p>
 * 基于数组实现的队列
 * </p >
 *
 * @author wujianlong
 * @package queue
 * @date 2019-10-24 11:32
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class QueueArray {

    private String[] array;

    //数组大小
    private int n = 0;

    //头元素索引下标
    private int head = 0;

    //尾部元素索引下标
    private int tail = 0;

    public QueueArray(int capacity) {
        array = new String[capacity];
        n = capacity;
    }

    /**
     * 入队
     *
     * @param data
     */
    public boolean enqueue(String data) {
        if (tail == n) {
            if(head==0){
                return false;
            }
            for(int i=head;i<tail;i++){
                array[i-head]=array[i];
            }
            head=0;
            tail=tail-head;
        }
        array[tail] = data;
        tail++;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String data = array[head];
        head++;
        return data;
    }

    public void printAll(){
        if (head == tail) {
           System.out.println("当前队列无数据！");
        }
        System.out.print("当前队列数据：");
        for(int i=head;i<tail;i++){
            System.out.print(array[i]+",");
        }
    }


    public static void main(String[] args){
        QueueArray queueArray=new QueueArray(10);
        queueArray.enqueue("1");
        queueArray.enqueue("2");
        queueArray.enqueue("3");
        queueArray.printAll();

        queueArray.dequeue();
        queueArray.printAll();

    }

}
