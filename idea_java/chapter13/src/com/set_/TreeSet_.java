package com.set_;

import java.util.Comparator;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
//        当使用无参构造器创建 TreeSet 对象实例，数据还是无序的
//        为 TreeSet 构造器传递一个比较器(匿名内部类)，根据指定的排序规则进行排序
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {

//                return ((String)o1).compareTo((String)o2);
                if(((String)o1).length() != ((String)o2).length()) {
                    return ((String)o1).length() - ((String)o2).length();
                }
                return ((String)o1).compareTo((String)o2);
            }
        });
        treeSet.add("jack");
        treeSet.add("smith");
        treeSet.add("john");
        treeSet.add("mary");
        treeSet.add("a");
        treeSet.add("smith");

        System.out.println(treeSet);

        /*
           TreeSet 底层就是 TreeMap
           构造器会把传入的比较器对象传给 TreeMap (TreeSet的底层) 的 comparator 属性
            public TreeSet(Comparator<? super E> comparator) {
                this(new TreeMap<>(comparator));
            }
               public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }

            private V put(K key, V value, boolean replaceOld) {
                Entry<K,V> t = root;
                if (t == null) {
                    addEntryToEmptyMap(key, value);
                    return null;
                }
                int cmp;
                Entry<K,V> parent;
                // split comparator and comparable paths
                Comparator<? super K> cpr = comparator; // 传入 构造器的匿名内部类的对象
                if (cpr != null) {
                    do {
                        parent = t;
                        // 动态绑定，直接调用构造器传入的匿名内部类的 compare 方法
                        cmp = cpr.compare(key, t.key);
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else {
                            V oldValue = t.value;
                            if (replaceOld || oldValue == null) {
                                t.value = value;
                            }
                            return oldValue;
                        }
                    } while (t != null);
                } else {
                    Objects.requireNonNull(key);
                    @SuppressWarnings("unchecked")
                    Comparable<? super K> k = (Comparable<? super K>) key;
                    do {
                        parent = t;
                        cmp = k.compareTo(t.key);
                        if (cmp < 0)
                            t = t.left;
                        else if (cmp > 0)
                            t = t.right;
                        else { // 如果通过比较器比较后两个对象相同(就是比较规则为0,则不会添加这次的元素)
                            V oldValue = t.value;
                            if (replaceOld || oldValue == null) {
                                t.value = value;
                            }
                            return oldValue;
                        }
                    } while (t != null);
                }
                addEntry(key, value, parent, cmp < 0);
                return null;
            }
         */
    }
}
