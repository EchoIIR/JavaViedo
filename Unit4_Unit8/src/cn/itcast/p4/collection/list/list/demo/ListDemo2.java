
package src.cn.itcast.p4.collection.list.list.demo;
import java.util.ArrayList;
// import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
在列表中使用迭代器操作时，在迭代器运算中（while(it.hasNext())）时：
1、不要使用集合操作元素（ list.add("abc9")），不然容易出现异常：
ConcurrentModificationException：这是因为同时用迭代器和列表操作，出现了矛盾冲突
2、可以使用迭代器Iterator接口的子接口ListIterator来完成在迭代中对元素的进行更多操作。
ListIterator实现在迭代中对集合修改。

*/
class ListDemo2{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        
        addInIterator(list);
    }

    public static void addInIterator(List<String> list) {
        // ========== 易错点：在Iterator的迭代期间使用集合操作元素（ list.add("abc9")）
        // =========== 在Iterator的迭代期间使用集合操作元素（ list.add("abc9")），容易出现异常：
        // System.out.println("list:" + list);
        // Iterator<String> it = list.iterator();
        // while(it.hasNext()){
        //     Object obj = it.next();// 每一个it.next()都是一次运算
        //     if(obj.equals("abc2")){
        //         list.add("abc9");//java.util.ConcurrentModificationException
        //         System.out.println("add!");
        //     }
        //     else{
        //         System.out.println("it.next()" + obj);
        //     }
        // }
        // System.out.println("list:" + list);

        // ============= 改正：可以使用迭代器Iterator接口的子接口ListIterator
        // ============= 来完成在迭代中对元素的进行更多操作
        System.out.println("Orign list:" + list);
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj.equals("abc2")){
                it.add("abc9");
                System.out.println("it.next()=" + obj + "\t==abc2");
            }else{
                System.out.println("it.next()=" + obj + "\t!=abc2");
            }
        }
        System.out.println("After listIterator list:" + list);
    }

}