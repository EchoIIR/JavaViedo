
package src.cn.itcast.p4.collection.list.list.demo;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

class ListDemo{
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        // Collection<String> coll = new ArrayList<String>();

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        System.out.println("list:" + list);
        // 1、增
        list.add(2,"abc1");
        System.out.println("\nThe result of list.add(2,abc1):\n" + list);
        // 2、删
        System.out.println("\nThe result of list.remove(2):\n" + list.remove(2) + "\t" +list);

        // 3、改
        System.out.println("\nThe result of list.set(2,abc1):\n" + list.set(2,"abc1") + "\t" +list);
        // 4、查
        System.out.println("\nThe result of list.get(3):\n" +  list.get(3) + "\t" +list);

        System.out.println("\nThe result of list.indexOf(abc3):\n" +   list.indexOf("abc3") + "\t" +list);
        System.out.println("\nThe result of list.lastIndexOf(abc3):\n" +   list.lastIndexOf("abc3") + "\t" +list);

        System.out.println("\nThe result of list.indexOf(abc2):\n" +   list.indexOf("abc2") + "\t" +list);
        System.out.println("\nThe result of list.lastIndexOf(abc2):\n" +   list.lastIndexOf("abc2") + "\t" +list);
        // lastIndexOf:返回最后出现的指定元素的索引列表,或-1(如果该列表不包含的元素)。
        System.out.println("\nThe result of list.indexOf(abc1):\n" +   list.indexOf("abc1") + "\t" +list);
        System.out.println("\nThe result of list.lastIndexOf(abc1):\n" +   list.lastIndexOf("abc1") + "\t" +list);
        // 5、取子串
        System.out.println("\nThe result of list.subList(1,3):\n" +   list.subList(1,3) + "\t" +list);

        // 6、遍历元素
        // 6.1、迭代器        
        System.out.println("\n\nwhile and list.iterator()");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "\t");
        }

        System.out.println("\n\nfor and list.iterator()");
        for(Iterator<String> it2 = list.iterator();it2.hasNext();){
            System.out.print(it2.next() + "\t");
        }
        // 6.2 list.get()
        System.out.println("\n\nlist.get()");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "\t");
        }
    }
}
 