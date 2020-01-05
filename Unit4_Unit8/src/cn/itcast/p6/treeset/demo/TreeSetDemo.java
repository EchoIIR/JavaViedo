package src.cn.itcast.p6.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;


import src.cn.itcast.p.bean.Person2;

class TreeSetDemo{
    public static void main(String[] args) {
        // ====== 一、TreeSet存字符串 ==============
        // TreeSet ts = new TreeSet();
        // ts.add("abc");
        // ts.add("aa");
        // ts.add("nba");
        // ts.add("cba");

        // Iterator it = ts.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // ====== 二、TreeSet存对象 ================
            System.out.println("\n====== 集合TreeSet中存对象-取重复对象（new之后不算重复） ========");
            TreeSet ts2 = new TreeSet(new ComparatorByName()); // 传入比较器
            // TreeSet ts2 = new TreeSet();

			System.out.println("TreeSet的add成功与否：\t"+ ts2.add(new Person2(21,"lisi1"))); // 不算重复元素
			System.out.println("TreeSet的add成功与否：\t"+ ts2.add(new Person2(23,"lisi2"))); // 不算重复元素
            System.out.println("TreeSet的add成功与否：\t"+ ts2.add(new Person2(28,"lisi3"))); // 不算重复元素
            System.out.println("TreeSet的add成功与否：\t"+ ts2.add(new Person2(29,"lisi4"))); // 不算重复元素
            System.out.println("TreeSet的add成功与否：\t"+ ts2.add(new Person2(23,"lisi5"))); // 不算重复元素

			System.out.println("\n ======= 开始输出添加完对象后的TreeSet");
			Iterator<Object> it2 = ts2.iterator();
			while(it2.hasNext()){
				Person2 obj = (Person2)it2.next(); 
				System.out.println("Person.getAge: " + obj.getAge() + "\tPerson.getName: " + obj.getName() + "\t全类名：" + obj);
			}

    }
}