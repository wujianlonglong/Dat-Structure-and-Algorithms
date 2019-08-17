/**
 * <p>
 * </p >
 *
 * @author wujianlong
 * @package PACKAGE_NAME
 * @date 2019-08-16 11:10
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class WjlLinked {

    public Node head;

    private int length;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node q = head;
            Node pre = null;
            while (q != null) {
                pre = q;
                q = q.next;
            }
            pre.next = newNode;
        }
    }

    public void setNodes(int[] datas) {
        head = null;
        int length = datas.length;
        if (length == 0) {
            return;
        }
        Node headNode = new Node(datas[0]);
        head = headNode;
        Node q = head;
        for (int i = 1; i < length; i++) {
            Node newNode = new Node(datas[i]);
            q.next = newNode;
            q = q.next;
        }
    }


}
