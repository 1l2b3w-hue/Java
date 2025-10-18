package com.map_;

import java.util.HashMap;
@SuppressWarnings({"all"})
public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("java",10);
        hashMap.put("php",10);
        hashMap.put("java",20);

        System.out.println(hashMap);

        /*
            源码解读 ：
            1.执行构造器 new HashMap()；
                初始化加载因子 ： loadFactor = 0.75
                HashMap$Node[] table = null;
            2.执行put() 方法
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }
            3.执行putVal方法
                final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                else {
                    Node<K,V> e; K k;
                // 如果新增的 Node 对象的 hash值与当前 table 表索引位置的 Node 对象的hash 值相等
                // 并且 新增的 Node 对象与当前对象是同一个对象 或者 他们的equals 是相等的
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    else if (p instanceof TreeNode) // 判断当前 table 表索引位置的 Node 对象是不是红黑树
                      // 按照红黑树的逻辑处理新增的 Node
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else { // 如果节点的后面是链表，就进行循环比较
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) { // 链表中没有与新增的 Node对象相同，将其加在最后
                                p.next = newNode(hash, key, value, null);
                                // 判断链表树是不是达到8，达到就调用方法进行树化
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                // 不会立即树化，要求链表 达到8，并且table长度达64，如果没有，则进行扩容
                                //否则才会进行树化
                                    treeifyBin(tab, hash);
                                break;
                            }
                            // 发现链表中有相同的，就退出循环不做处理，再进行替换处理
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value; // 对原来的 value 进行替换
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)
                    resize();
                afterNodeInsertion(evict);
                return null;
            }
         */

    }
}
