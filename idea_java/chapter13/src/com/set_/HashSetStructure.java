package com.set_;

public class HashSetStructure {
    public static void main(String[] args) {
//        简单模拟实现一个 数组 + 链表  (单纯数组存放效率很低，因此引进链表)
//        创建一个Node数组
        Node[] table = new Node[10];

        System.out.println(table);

        table[2] = new Node("Jack",null);
        table[2].next = new Node("Jhon",null);
        table[2].next.next = new Node("Rose",null);

        Node lucy = new Node("lucy",null);
        table[3] = lucy;
        System.out.println(table);
    }
}
class Node { // 存放数据，并指向下一个Node，实现链表
    Object items;
    Node next;

    public Node(Object items, Node next) {
        this.items = items;
        this.next = next;
    }
}
