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

    class Node {
        Node next = null;// 节点的引用，指向下一个节点
        int data;// 节点的对象，即内容

        public Node(int data) {
            this.data = data;
        }
    }

    public static boolean isPalidrome(Node node) {

        return true;
    }

    public static void main(String[] args) {

    }
}
