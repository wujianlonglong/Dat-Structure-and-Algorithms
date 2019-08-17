/**
 * <p>
 * 基于链表的LRU算法
 * </p >
 *
 * @author wujianlong
 * @package PACKAGE_NAME
 * @date 2019-08-15 16:50
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class LruLinkedList {

    /**
     * 头结点
     */
    private Node head = null;

    /**
     * 链表长度为10
     */
    private int length = 0;

    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    /**
     * 添加新node
     *
     * @param data
     */
    public void addNode(int data) {
        Node newNode = new Node(data, null);
        if (null == head) {
            head = newNode;
            length++;
        } else {
            Node q = head;
            //如果头结点的值与新添加节点的值相同则不处理
            if (q.getData() == newNode.getData()) {
                return;
            }
            Node pre = null;
            while (q != null) {
                //有相同的值则将该结点删除并将新添加的节点插入头部
                if (q.getData() == newNode.getData()) {
                    //新节点插入头部
                    newNode.next = head;
                    head = newNode;
                    //删除旧节点
                    Node next = q.next;
                    pre.next = next;
                    q.next = null;
                    break;
                }
                //遍历至结尾没有相同值的节点，将新添加的节点插入头部，如果链表满了则删除尾部节点
                if (q.next == null) {
                    if (length >= 10) {
                        pre.next = null;
                    } else {
                        length++;
                        //新节点插入头部
                        newNode.next = head;
                        head = newNode;
                    }
                    break;
                }
                pre = q;
                q = q.next;
            }
        }
    }

    /**
     * 打印所有节点数据
     */
    public void printAll() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LruLinkedList lruLinkedList = new LruLinkedList();
        lruLinkedList.addNode(1);
        lruLinkedList.printAll();
        lruLinkedList.addNode(1);
        lruLinkedList.printAll();
        lruLinkedList.addNode(2);
        lruLinkedList.printAll();
        lruLinkedList.addNode(1);
        lruLinkedList.printAll();
    }

}
