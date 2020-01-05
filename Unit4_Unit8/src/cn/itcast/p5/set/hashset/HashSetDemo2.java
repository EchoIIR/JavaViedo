package src.cn.itcast.p5.set.hashset;
// 取掉ArrayList的重复元素

import java.util.ArrayList;
import java.util.Iterator;

import src.cn.itcast.p.bean.Person;

class HashSetDemo2 {
	public static void main(String[] args) {
		// ArrayList a1 = new ArrayList();
		// a1.add(new Person(21,"lisi1"));
		// a1.add(new Person(21,"lisi1"));
		// a1.add(new Person(22,"lisi2"));
		// a1.add(new Person(23,"lisi3"));
		// a1.add(new Person(24,"lisi4"));
		// a1.add(new Person(25,"lisi5"));
		// a1.add(new Person(26,"lisi6"));
		// a1.add(new Person(27,"lisi7"));
		
		// System.out.println("===== Before a1:");
		// printArrayList(a1); 

		// a1 = getSingleElement(a1);

		// System.out.println("===== After a1:");
		// printArrayList(a1);

		ArrayList a2 = new ArrayList();
		a2.add("hehe");
		a2.add("xixi");
		a2.add("heihei");
		a2.add("hehe");
		a2.add("xixi");
		a2.add("adc4");
		System.out.println("Before getSingleElement:" + a2);
		a2 = getSingleElement(a2);
		System.out.println("After getSingleElement:" + a2);
	}

	private static void printArrayList(ArrayList a1) {
		Iterator it = a1.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			//System.out.println(it.next());
			System.out.println("Person.getAge: " + ((Person) obj).getAge() + "\tPerson.getName: " + ((Person) obj).getName());
		}
		// Iterator<Object> it = a1.iterator();
		// while(it.hasNext()){
		// 	// Object obj = it.next(); // it.next()出现一次，next自动往下走一次			
		// 	// System.out.println("Person.getName: " + ((Person) obj).getName());// 类型转化后调用方法getName
		// 	// System.out.println("Person.getAge: " + ((Person) obj).getAge());// 类型转化后调用方法getAge
			
		// 	Person obj = (Person)it.next(); 
		// 	System.out.println("\n全类名：" + obj);// 打印全类名
		// 	System.out.println("类名getClass: " + obj.getClass());// 打印类名
		// 	System.out.println("Person.getAge: " + obj.getAge() + "\tPerson.getName: " + obj.getName());
		// }
	}

	private static ArrayList getSingleElement(ArrayList a1) {
		ArrayList temp = new ArrayList();

		Iterator it = a1.iterator();

		while(it.hasNext()){
			Object obj = it.next();
			if (!(temp.contains(obj))){// 通过equals判断
				temp.add(obj);
			}
		}
		return temp;
	}
}