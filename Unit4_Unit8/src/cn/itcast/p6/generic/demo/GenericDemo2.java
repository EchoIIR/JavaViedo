package src.cn.itcast.p6.generic.demo;
//  通过TreeSet演示泛型

import java.util.Iterator;
import java.util.TreeSet;

import src.cn.itcast.collection.set.treeset.comparator.ComparatorByName;
import src.cn.itcast.p3.bean.Person2;

class GenericDemo2{
    public static void main(String[] args) {
        // 定义的时候就明确类型
        // TreeSet<Person2> ts = new TreeSet<Person2>(); 
        TreeSet<Person2> ts = new TreeSet<Person2>(new ComparatorByName()); // 传入比较器

        ts.add(new Person2(14,"lisi2"));
        ts.add(new Person2(21,"lisi3"));
        ts.add(new Person2(19,"lisi4"));
        ts.add(new Person2(12,"lisi1"));
        ts.add(new Person2(14,"lisi2"));

        // 要想使得输出按年龄或者姓名排序，
        // 就修改Person2中的compareTo(Person2 o)方法 
        Iterator<Person2> it = ts.iterator();
        while(it.hasNext()){
            Person2 person = (Person2) it.next();
            System.out.println("age:" + person.getAge() + "\tname:"+person.getName());
        }
    }
}