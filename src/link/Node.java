package link;

/**
 * <p>
 * </p >
 *
 * @author wujianlong
 * @package PACKAGE_NAME
 * @date 2019-08-16 11:09
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Node {

    public int data;

    public Node next = null;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
