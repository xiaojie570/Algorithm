package com.string;

/**
 * 判断单向链表是不是回文？
 * 思路：
 *  易于想到的思路是采用两个指针，从两边或者中间开始遍历，并判断对应字符是否相等。
 *  但是由于单链表是单向的，如何实现双向链表呢？比较常见的思路是采用经典的快慢指针的方法，可先定位到链表的中间位置，
 *  再将链表的后半段逆置，然后用两个指针同时从链表头部和中间开始逐一向后遍历比较。
 *
 * Created by lenovo on 2018/11/11.
 */
public class Palindrome_2 {



    public static boolean isPalidrome(Node node) {
        Node temp = node;
        Node first = node;
        int count = 0;
        while(temp.next != null) {
            count ++;
            temp = temp.next;
        }
        count = count / 2 ;
        temp = node;
        while(count -- != 0) {
            temp = temp.next;
        }
        temp = reverse(temp);


        if(temp.next != null)
            temp = temp.next;
        while(temp != null) {

            if(first.data != temp.data)
                return false;
            temp = temp.next;
            first = first.next;
        }
        return true;
    }

    private static Node reverse(Node node) {
        Node head = node;
        Node p = new Node();
        Node q = new Node();
        if(head.next != null)
            p = head.next;
        while(p.next != null) {
            q = p.next;
            p.next = q.next;
            // 这个地方容易出错
            q.next = head.next;
            head.next = q;
        }

        return head;
    }
    public static void main(String[] args) {
        Palindrome_2 palindrome2 = new Palindrome_2();
        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(1);
        Node node4 = new Node(0);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;


        /*Node resu = palindrome2.reverse(node3);
        while(resu != null){
            System.out.print(resu.data + ", ");
            resu = resu.next;
        }*/
        System.out.println(isPalidrome(node1));
    }
}

class Node {
    Node next = null;// 节点的引用，指向下一个节点
    int data;// 节点的对象，即内容

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }
}
