package src.cn.itcast.p4.collection.collection.demo;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<String>(); // ArrayList()：构造一个初始容量为10的空列表
        Collection<String> c2 = new ArrayList<String>();
        // 1、 增
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");
        c2.add("zzzz");

        show(c1,c2);

        printElementInColletion(c1);
    }
    
    private static void printElementInColletion(Collection<String> c2) {
 
        System.out.println("\n ======== 输出集合中单个元素 ==");
        System.out.println("Orign c2:" + c2);
        // ======方法一 ：c2.toArray()： 将集合转换为数组 ==========
        /*        
            toArray（）：此方法将集合转换为数组，但是返回值类型只能为Object[] 
            不可进行强制转换
            否则会出现java.lang.ClassCastException
        */
        System.out.println("\n ==== 方法一 ：c2.toArray() ====");
        Object[] arr = c2.toArray();
        System.out.println("After  arr = c2.toArray() and \nprint element in the arr:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // ======== 方法二：使用迭代器Iterator it = c2.iterator();
        System.out.println("\n ==== 方法二 ：c2.iterator() ====");
        // ======= 写法1 ======
        // Iterator it = c2.iterator();
        // while(it.hasNext()){// 先判断有没有，在取。 
        //     System.out.println(it.next());
        // }
        // ======= 写法2 =====
        for(Iterator<String> it = c2.iterator();it.hasNext();){
            System.out.println(it.next());
        }

    }

    private static void show(Collection <String> c1, Collection <String> c2) {
       

        // 1、增加        
        System.out.println("\n ==========1、增加 ==========");
        System.out.println("Orign c1:" + c1);
        c1.add("zzzz");
        System.out.println("After add zzzz:" + c1);
        // 2、删
        System.out.println("\n ========== 2、删 ==========");
        System.out.println("Orign c1:" + c1);
        System.out.println("Orign c2:" + c2);
        c1.remove("abc2");
        System.out.println("After c1 remove abc2:\t" + c1);

        c1.removeAll(c2);
        System.out.println("After c1 removeAll c2:\t" + c1);

        c1.clear();
        System.out.println("After c1 clear:\t" + c1);

        // 3、判断
        System.out.println("\n ========== 3、判断 ==========");
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        c2.clear();
        c2.add("abc1");
        c2.add("abc3");
        c2.add("abc4");
        c2.add("zzz");

        System.out.println("Orign c1:" + c1);
        System.out.println("Orign c2:" + c2);
        System.out.println("c1 contains abc3:" + c1.contains("abc3"));
        //  c1.containsAll(c2)：c2是c1的子集，则为真。
        System.out.println("c1 contains c2:" + c1.containsAll(c2));
        
        // 4、取交集
        System.out.println("\n ========== 4、取交集 ==========");
        System.out.println("Orign c1:" + c1);
        System.out.println("Orign c2:" + c2);
        c1.retainAll(c2);
        System.out.println("After c1 retainAll c2,c1:" + c1);
    }

}