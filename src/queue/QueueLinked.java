package queue;

import link.Node;

/**
 * <p>
 * 基于链表的队列
 * </p >
 *
 * @author wujianlong
 * @package queue
 * @date 2019-10-24 13:38
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class QueueLinked {

    private Node head;

    private Node tail;

    //队列总容量
    private int capacity = 0;

    //队列元素数量
    private int count = 0;

    public QueueLinked(int capacity) {
        this.capacity = capacity;
    }


    /**
     * 入队
     *
     * @return
     */
    public boolean enqueue(int data) {
        if (capacity == count) {
            return false;
        }
        Node node = new Node(data);
        if (null == head) {
            head = node;
            tail = node;
            return true;
        }
        tail.next = node;
        tail = node;
        count++;
        return true;
    }

    /**
     * 出队
     *
     * @return
     */
    public int dequeue() {
        if (count == 0) {
            return 0;
        }
        int data = head.data;
        head = head.next;
        count--;
        return data;

    }

    public void printAll() {
        if (count == 0) {
            System.out.println("当前队列没有数据！");
        }
        System.out.print("当前队列数据：");
        Node p = head;
        while (p != null) {
            System.out.print(p.data + ",");
            p = p.next;
        }
    }


    public static void main(String[] args) {
        QueueLinked queueLinked = new QueueLinked(10);
        queueLinked.enqueue(1);
        queueLinked.enqueue(2);
        queueLinked.enqueue(3);
        queueLinked.printAll();

        queueLinked.dequeue();
        queueLinked.printAll();
    }

}
