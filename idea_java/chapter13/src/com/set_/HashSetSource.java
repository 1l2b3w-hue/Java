package com.set_;

import java.util.HashSet;

public class HashSetSource {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("java");
        set.add("php");
        set.add("java");

        System.out.println("set = " + set);

        /*
            源码解读
               7：
                   public HashSet() {
                        map = new HashMap<>();  // 底层就是 HashMap
                    }
               8：add()
                public boolean add(E e) { // e : "java"
                    return map.put(e, PRESENT)==null; //  static Object PRESENT = new Object()
                }

                put():
                public V put(K key, V value) {
                    return putVal(hash(key), key, value, false, true);
                }
                hash(key) 会得到 key 的哈希值，但并不等价与 hashCode() ：h = key.hashCode()) ^ (h >>> 16)

                putVal() : 核心
                final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                    Node<K,V>[] tab; Node<K,V> p; int n, i; // 辅助变量
                    // if 判断 table 是不是为空，或者table的大小是不是为0，整体上就是第一次扩容 (16)
                    if ((tab = table) == null || (n = tab.length) == 0)
                        n = (tab = resize()).length;
                    // 求出 存放的 hash 值应该放入 table 的哪个索引位置，并将该位置的对象赋值给 p
                    // 继续判断 p 是不是 null 看这个位置是不是空的
                    空就创建一个Node对象newNode(hash(判断后面是不是相同的), key, value, null)，放入该位置
                    没空就准备放链表
                    if ((p = tab[i = (n - 1) & hash]) == null)
                        tab[i] = newNode(hash, key, value, null);
                    else {
                        Node<K,V> e; K k;
                        if (p.hash == hash &&
                            ((k = p.key) == key || (key != null && key.equals(k))))
                            //p.hash == hash : 如果当前索引位置上的对象的 hash 与要添加的 key 的哈希值一样
                            //(k = p.key) == key ：当前索引上的对象的 key 与 要添加 key 是同一个对象
                            //(key != null && key.equals(k)) ： 或者不是同一个对象，但是内容相同
                            // 满足，就不加入
                            e = p;
                            // 再判读 p 是不是红黑树，如果是，就调用 putTreeVal 进行添加
                        else if (p instanceof TreeNode)
                            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                        else {
                            for (int binCount = 0; ; ++binCount) {
                            // 依次与该链表中的每一个元素相比较，如果比到最后，都不同，直接加在链表最后面
                                // 添加元素到链表后，立即判断是不是该链表是否已经达到 8 个节点，
                                // 达到了就调用 treeifyBin 对当前链表进行树化
                                // 如果 table 的长度没有到达 64， 就会先对 table 进行扩容后才进行树化
                            // 如果再比较过程中，发现了相同情况，直接跳出 for 循环
                                if ((e = p.next) == null) {
                                    p.next = newNode(hash, key, value, null);
                                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                        treeifyBin(tab, hash);
                                    break;
                                }
                                if (e.hash == hash &&
                                    ((k = e.key) == key || (key != null && key.equals(k))))
                                    break;
                                p = e; // 移动 p 节点
                            }
                        }
                        if (e != null) { // existing mapping for key
                            V oldValue = e.value;
                            if (!onlyIfAbsent || oldValue == null)
                                e.value = value;
                            afterNodeAccess(e);
                            return oldValue;
                        }
                    }
                    ++modCount;
                    if (++size > threshold) // 在第一次扩容中 resize() 方法中确定的临界值
                        resize();
                    afterNodeInsertion(evict); //HashMap 留给子类去实现的一个空方法
                    return null;
                }

         */
    }
}
