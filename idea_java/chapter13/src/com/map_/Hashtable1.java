package com.map_;

import java.util.Hashtable;
@SuppressWarnings({"all"})
public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
//        hashtable.put("john",100);
//        hashtable.put("lucy",100);
//        hashtable.put("lic",100);
//        hashtable.put("lic",88);
        for(int i = 1; i < 15; i++) {
            hashtable.put("hello" + i,i);
        }
        System.out.println(hashtable);

        /*
            底层分析 ：
                1.底层数组为 ： Hashtable$Entry[] ,初始化为 11  加载因子还是 ： 0.75 临界值算法一样
                2. 键值对 是存放在 Hashtable$Entry 中，注意区分与 Map.Entry 的区别
                    private static class Entry<K,V> implements Map.Entry<K,V>
                3.扩容 ： 原大小 * 2 + 1

                 public Hashtable() {
                    this(11, 0.75f); (数组大小，加载因子)
                }

                public synchronized V put(K key, V value) {
                    // Make sure the value is not null
                    if (value == null) {
                        throw new NullPointerException();
                    }

                    // Makes sure the key is not already in the hashtable.
                    Entry<?,?> tab[] = table;
                    int hash = key.hashCode();
                    int index = (hash & 0x7FFFFFFF) % tab.length;
                    @SuppressWarnings("unchecked")
                    Entry<K,V> entry = (Entry<K,V>)tab[index];
                    // 看当前 table 上指定索引位置是不是空的 ，是就加上去
                    for(; entry != null ; entry = entry.next) {
                        if ((entry.hash == hash) && entry.key.equals(key)) {
                            V old = entry.value;
                            entry.value = value;
                            return old;
                        }
                    }

                    addEntry(hash, key, value, index);
                    return null;
                }

                 private void addEntry(int hash, K key, V value, int index) {
                    Entry<?,?> tab[] = table;
                    if (count >= threshold) { // 判断达到临界值了没
                        // Rehash the table if the threshold is exceeded
                        rehash();

                        tab = table;
                        hash = key.hashCode();
                        index = (hash & 0x7FFFFFFF) % tab.length;
                    }

                    // Creates the new entry.
                    @SuppressWarnings("unchecked")
                    Entry<K,V> e = (Entry<K,V>) tab[index];
                    // 将增加的键值对加上table表，并让其 next 指向原来在该索引上的键值对(原来没有就指空)
                    // 插头法，插在头部，不插在尾部
                    tab[index] = new Entry<>(hash, key, value, e);
                    count++; // table表中的元素数量
                    modCount++; // 修改次数
                }

                protected void rehash() {
                    int oldCapacity = table.length;
                    Entry<?,?>[] oldMap = table;

                    // overflow-conscious code
                    int newCapacity = (oldCapacity << 1) + 1; // 这就是扩容
                    if (newCapacity - MAX_ARRAY_SIZE > 0) {
                        if (oldCapacity == MAX_ARRAY_SIZE)
                            // Keep running with MAX_ARRAY_SIZE buckets
                            return;
                        newCapacity = MAX_ARRAY_SIZE;
                    }
                    Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];

                    modCount++;
                    threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
                    table = newMap; // 替换原数组 (清空了table)
                    // 将原内容加入 table
                    for (int i = oldCapacity ; i-- > 0 ;) {
                        for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) {
                            Entry<K,V> e = old;
                            old = old.next;

                            int index = (e.hash & 0x7FFFFFFF) % newCapacity;
                            e.next = (Entry<K,V>)newMap[index];
                            newMap[index] = e;
                        }
                    }
                }
         */
    }
}
