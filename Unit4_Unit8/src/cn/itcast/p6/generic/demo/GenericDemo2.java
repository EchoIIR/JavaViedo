package src.cn.itcast.p6.generic.demo;
//  通过ArrayList演示泛型

import java.util.Iterator;
import java.util.TreeSet;

import src.cn.itcast.p3.bean.Person2;

class GenericDemo2{
    public static void main(String[] args) {
        // 定义的时候就明确类型
        TreeSet<Person2> ts = new TreeSet<Person2>(); 
        ts.add(new Person2(12,"lisi1"));
        ts.add(new Person2(14,"lisi2"));
        ts.add(new Person2(21,"lisi3"));
        ts.add(new Person2(19,"lisi4"));

        Iterator<Person2> it = ts.iterator();
        while(it.hasNext()){
            Person2 person = (Person2) it.next();
            System.out.println("age:" + person.getAge() + "\tname:"+person.getName());
        }
    }
}