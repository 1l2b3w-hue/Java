package com.list_;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("Jack");
        Node tom = new Node("Tom");
        Node smith = new Node("Smith");

//        形成双向链表
        jack.next = tom;

        tom.next = smith;
        tom.prev = jack;

        smith.prev = tom;

        Node first = jack;
        Node end = smith;
        printinfo(first,end);

//        在 Tom 与 smith 之间加入一个对象 张飞
        Node zf = new Node("张飞");
        tom.next = zf;
        zf.prev = tom;
        zf.next = smith;
        smith.prev = zf;
        printinfo(first,end);
    }
    public static void printinfo(Node first,Node end) {
        System.out.println("===== 从头到尾 ======");
        while(true) {
            if(first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println("===== 从尾到头 =====");
        while(true) {
            if(end == null) {
                break;
            }
            System.out.println(end);
            end = end.prev;
        }
    }
}
// 模拟实现一个双向链表
// 定义一个 Node 类， 其实例对象对应双向链表的一个节点
class Node {
    public Object item; // 存放具体内容
    public Node next; // 指向下一个节点
    public Node prev;// 指向上一个节点


    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
