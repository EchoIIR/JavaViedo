package src.cn.itcast.p6.generic.demo;
// 通过ArrayList演示泛型
import java.util.ArrayList;
import java.util.Iterator;

class GenericDemo{
    public static void main(String[] args) {
        //泛型：<> ，用于确保类型的安全。
        ArrayList<String> a1 = new ArrayList<String>();

        a1.add("abc");
        a1.add("hahaha");
        // a1.add(4); // a1.add(Integer(4));

        Iterator<String> it = a1.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}