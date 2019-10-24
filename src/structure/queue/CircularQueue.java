package structure.queue;

public class CircularQueue {
    // 数组：items，数组大小：n
    private String[] items;
    private int n = 0;
    // head表示队头下标，tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为capacity的数组
    public CircularQueue(int capacity) {
        //该方式会多出一个数组的存储空间，所以需要capacity+1保证队列存储数据大小正常
        items = new String[capacity+1];
        n = capacity+1;
    }

    // 入队
    public boolean enqueue(String item) {
        // 队列满了
        if ((tail + 1) % n == head) return false;
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    // 出队
    public String dequeue() {
        // 如果head == tail 表示队列为空
        if (head == tail) return null;
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }


    public static void main(String[] args){
        CircularQueue circularQueue=new CircularQueue(8);
        circularQueue.enqueue("a");
        circularQueue.enqueue("b");
        circularQueue.enqueue("c");
        circularQueue.enqueue("d");
        circularQueue.enqueue("e");
        circularQueue.enqueue("f");
        circularQueue.enqueue("g");
        circularQueue.enqueue("h");
        circularQueue.enqueue("i");
        circularQueue.enqueue("j");
        circularQueue.dequeue();
        circularQueue.enqueue("k");


    }

}
