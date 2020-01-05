
package src.cn.itcast.p4.collection.list.arraylist.test;
/*
1、ArrayList的对象可以通过add，添加Person的对象：add(new Person(21,"lisi1"));
2、ArrayList的对象也可以使用迭代器，遍历其元素（Person的对象）。
3、当ArrayList的对象为另一个类的对象时，可以先强制类型转换，然后就可以调用其方法了。
*/ 
import java.util.ArrayList;
import java.util.Iterator;

import src.cn.itcast.p3.bean.Person;

class ArrayListDemo {
	public static void main(String[] args) {
		// 集合ArrayList中存对象
		ArrayList<Object> a1 = new ArrayList<Object>();
		System.out.println("\n======  列表ArrayList中存对象");
		a1.add(new Person(21,"lisi1"));
		a1.add(new Person(21,"lisi1"));		
		a1.add(new Person(21,"lisi1"));		
		a1.add(new Person(21,"lisi1"));
		a1.add(new Person(21,"lisi1"));
		a1.add(new Person(22,"lisi2"));
		a1.add(new Person(23,"lisi3"));
		a1.add(new Person(24,"lisi4"));
		 
		Iterator<Object> it = a1.iterator();
		while(it.hasNext()){
			// Object obj = it.next(); // it.next()出现一次，next自动往下走一次			
			// System.out.println("Person.getName: " + ((Person) obj).getName());// 类型转化后调用方法getName
			// System.out.println("Person.getAge: " + ((Person) obj).getAge());// 类型转化后调用方法getAge
			
			Person obj = (Person)it.next(); 
			System.out.println("\n全类名：" + obj);// 打印全类名
			System.out.println("类名getClass: " + obj.getClass());// 打印类名
			System.out.println("Person.getAge: " + obj.getAge() + "\tPerson.getName: " + obj.getName());
		}
		// 集合ArrayList中存数字
		System.out.println("\n====== 列表ArrayList中存数字-自动装箱");
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(1); // a2.add(new Integer(5));
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);

		Iterator<Integer> it2 = a2.iterator();

		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}
}