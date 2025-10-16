package com.list_;

import java.util.LinkedList;

public class LinkedListSource {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList);
        linkedList.set(1,999);
        System.out.println(linkedList);
        Object o = linkedList.get(1);
        System.out.println(o);
        /*
            源码追踪：
            7 ： 调用无参构造器构造对象
            8 ：执行add() 方法
              public boolean add(E e) {
                linkLast(e);
                return true;
            }
            执行linkLast ，将新增的节点放入双向链表的最后
            void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null);
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }
            12 : remove()方法
             public E remove() {
                return removeFirst(); //跳转执行删除第一个节点方法
            }

                public E removeFirst() {
                    final Node<E> f = first;
                    if (f == null)
                        throw new NoSuchElementException();
                    return unlinkFirst(f); // 继续跳转
                }

                private E unlinkFirst(Node<E> f) {
                    // assert f == first && f != null;
                    final E element = f.item;
                    final Node<E> next = f.next;
                    f.item = null;
                    f.next = null; // help GC
                    first = next;
                    if (next == null)
                        last = null;
                    else
                        next.prev = null;
                    size--;
                    modCount++;
                    return element; // 返回了被删除的元素
                }
         */
    }
}
