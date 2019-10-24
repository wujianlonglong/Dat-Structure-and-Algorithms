package structure.stack;

import structure.link.Node;

/**
 * <p>
 * 基于链表实现的栈
 * </p >
 *
 * @author wujianlong
 * @package stack
 * @date 2019-10-23 20:57
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class StackLinked {

    private Node head;

    /**
     * 栈的大小
     */
    private int n;

    /**
     * 链表中元素数量
     */
    private int count;

    public StackLinked(int n) {
        this.n = n;
        count = 0;
    }

    /**
     * 清空栈元素
     */
    public void cleanAll(){
        head=null;
        count=0;
    }

    /**
     * 入栈
     *
     * @param data
     * @return
     */
    public boolean push(int data) {
        if (count == n) {
            return false;
        }
        Node node = new Node(data);
        if (null == head) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        count++;
        return true;
    }


    /**
     * 出栈
     *
     * @return
     */
    public int pop() {
        if (count == 0) {
            return 0;
        }
        int data = head.data;
        head = head.next;
        count--;
        return data;
    }

    /**
     * 打印栈顶元素
     */
    public void printHead(){
        if (count == 0) {
            System.out.println("当前栈为空！");
        }
        System.out.print("当前栈定元素：");
        System.out.print(head.getData());

    }

    /**
     * 打印栈
     */
    public void printAllStack() {
        if (count == 0) {
            System.out.println("当前栈为空！");
        }
        System.out.print("当前栈元素：");
        Node p = head;
        while (p != null) {
            System.out.print(p.getData() + ",");
            p = p.next;
        }
        System.out.println("");
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        StackLinked stackLinked = new StackLinked(10);
        stackLinked.push(1);
        stackLinked.push(2);
        stackLinked.push(5);
        stackLinked.printAllStack();
        stackLinked.pop();
        stackLinked.printAllStack();

    }

}
