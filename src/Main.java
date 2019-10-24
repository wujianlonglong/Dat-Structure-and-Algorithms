import structure.link.LinkedUtils;
import structure.link.Node;
import structure.link.WjlLinked;

public class Main {

    public static void main(String[] args) {
        WjlLinked wjlLinked=new WjlLinked();
        int[] arrs=new int[]{3,4,6,8,9,12,23};
        wjlLinked.setNodes(arrs);
        Node node1=wjlLinked.head;
        LinkedUtils.printAllNodes(node1);

        arrs=new int[]{1,4,7,9,22,44};
        wjlLinked.setNodes(arrs);
        Node node2=wjlLinked.head;
        LinkedUtils.printAllNodes(node2);

        Node mergNode= LinkedUtils.mergNodes(node1,node2);
        LinkedUtils.printAllNodes(mergNode);

        Node midNode=LinkedUtils.mid(mergNode);
        System.out.println("中间节点值："+midNode.data);


//        wjlLinked.head= link.LinkedUtils.reverse(node);
//        node=wjlLinked.head;
//        link.LinkedUtils.printAllNodes(node);
//
//        if(link.LinkedUtils.isCircle(node)){
//            System.out.println("环状链表");
//        }else{
//            System.out.println("非环状链表");
//        }



//        wjlLinked.head=link.LinkedUtils.deletLastN(node,8);
//        node=wjlLinked.head;
//        link.LinkedUtils.printAllNodes(node);

//        node.next.next.next=node;
//        if(link.LinkedUtils.isCircle(node)){
//            System.out.println("环状链表");
//        }else{
//            System.out.println("非环状链表");
//        }

//        link.LinkedUtils.printAllNodes(node);


    }
}
