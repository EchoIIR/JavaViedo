
package src.cn.itcast.p4.collection.set.hashset.demo;
import java.util.HashSet;
import java.util.Iterator;
// import java.util.LinkedHashSet;

// import src.cn.itcast.p.bean.Person;

class HashSetDemo{
	public static void main(String[] args) {
			// 集合ArrayList中存对象
			// HashSet<Object> h1 = new HashSet<Object>();
			// System.out.println("\n====== 集合HashSet中存对象-取重复对象（new之后不算重复） ========");
			// Person obj1 = new Person(21,"lisi1");
			// Person obj2 = new Person(22,"lisi2");
			// Person obj3 = new Person(23,"lisi3");
			// //HashSet的对象h1使用add方法时，会先做两个判断hashCode是否相等，equals是否相等，
			// // 如果hashCode不同，就直接添加
			// // 反之，再比较内容是否相同，内容同就不管了，不同时要拓展空间再存储。
			// System.out.println("HashSet的add成功与否：\t"+ h1.add(obj1));   //重复元素
			// System.out.println("HashSet的add成功与否：\t"+ h1.add(obj1));	//重复元素
			// System.out.println("HashSet的add成功与否：\t"+ h1.add(obj1));	//重复元素

			// System.out.println("HashSet的add成功与否：\t"+ h1.add(new Person(21,"lisi1"))); // 不算重复元素
			// System.out.println("HashSet的add成功与否：\t"+ h1.add(new Person(21,"lisi1"))); // 不算重复元素

			// System.out.println("HashSet的add成功与否：\t"+ h1.add(obj2));
			// System.out.println("HashSet的add成功与否：\t"+ h1.add(obj3));

			// System.out.println("\n ======= 开始输出添加完对象后的HashSet");
			// Iterator<Object> it = h1.iterator();
			// while(it.hasNext()){
			// 	Person obj = (Person)it.next(); 
			// 	System.out.println("Person.getAge: " + obj.getAge() + "\tPerson.getName: " + obj.getName() + "\t全类名：" + obj);
			// }
			// ============= 集合ArrayList中存数字 =============
			System.out.println("\n====== 集合HashSet中存数字-去重复元素 ========");
			HashSet<Integer> h2 = new HashSet<Integer>();
			System.out.println("HashSet的add成功与否：\t"+ h2.add(1)); // a2.add(new Integer(1));
			System.out.println("HashSet的add成功与否：\t"+ h2.add(1));
	
			System.out.println("HashSet的add成功与否：\t"+ h2.add(2));
			System.out.println("HashSet的add成功与否：\t"+ h2.add(3));

			System.out.println("\n ======= 开始输出添加完数字后的HashSet");
			Iterator<Integer> it2 = h2.iterator();
			while(it2.hasNext()){
				System.out.println(it2.next());
			}

			System.out.println("\n====== 集合HashSet中存数字-去重复元素 ========");
			HashSet<String> h3 = new HashSet<String>(); 			// 无序
			// HashSet<String> h3 = new LinkedHashSet<String>();	// 有序
			System.out.println("HashSet的add成功与否：\t"+ h3.add("haha")); // a2.add(new Integer(1));
			System.out.println("HashSet的add成功与否：\t"+ h3.add("hehe"));
			System.out.println("HashSet的add成功与否：\t"+ h3.add("xixi"));
			System.out.println("HashSet的add成功与否：\t"+ h3.add("heihei"));
			System.out.println("HashSet的add成功与否：\t"+ h3.add("hehe"));
			
			System.out.println("\n ======= 开始输出添加完数字后的HashSet");
			Iterator<String> it3 = h3.iterator();
			while(it3.hasNext()){
				System.out.println(it3.next());
			}

			/*
			 ======= 开始输出添加完数字后的HashSet
				haha
				heihei
				hehe
				xixi
			*/
	}
} 

