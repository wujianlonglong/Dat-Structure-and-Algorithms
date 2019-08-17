/**
 * <p>
 * </p >
 *
 * @author wujianlong
 * @package PACKAGE_NAME
 * @date 2019-08-16 11:35
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class LinkedUtils {

    /**
     * 打印所有节点数据
     *
     * @param node
     */
    public static void printAllNodes(Node node) {
        if (node == null) {
            return;
        }
        System.out.print("打印链表：");
        while (node != null) {
            System.out.print(node.data + "  ");
            node = node.next;
        }
        System.out.println();
    }

    /**
     * 链表反转
     *
     * @param node
     */
    public static Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node pre = null;
        while (node != null) {
            Node next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

    /**
     * 链表环检测
     *
     * @return
     */
    public static boolean isCircle(Node node) {
        if (node == null || node.next == null) {
            return false;
        }
        Node slow = node;
        Node fast = node.next;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * 删除倒数第n个节点
     *
     * @param node
     * @param n
     */
    public static Node deletLastN(Node node, int n) {
        Node head = node;
        if (node == null || n == 0) {
            System.out.println("删除参数异常：链表为空或者n为0");
            return head;
        }
        for (int i = 0; i < n; i++) {
            if (node == null) {
                System.out.println("删除参数异常：n超出链表长度");
                return head;
            }
            node = node.next;
        }

        //删除第1个节点
        if (node == null) {
            return head.next;
        }

        Node pre = head;
        while (node.next != null) {
            pre = pre.next;
            node = node.next;
        }
        pre.next = pre.next.next;

        return head;

    }


    /**
     * 合并两个有序的链表
     *
     * @param node1
     * @param node2
     * @return
     */
    public static Node mergNodes(Node node1, Node node2) {
        Node head = new Node(0);
        Node q = head;
        while (node1 != null && node2 != null) {
            if (node1.data <= node2.data) {
                q.next = node1;
                node1 = node1.next;
            } else {
                q.next = node2;
                node2 = node2.next;
            }
            q = q.next;
        }
        if (node1 == null) {
            q.next = node2;
        } else {
            q.next = node1;
        }

        return head.next;
    }


    /**
     * 取中间值
     *
     * @param node
     * @return
     */
    public static Node mid(Node node) {
        if (node == null) {
            return node;
        }
        Node slow = node;
        Node fast = node;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }


}
