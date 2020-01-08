package src.cn.itcast.p3.bean;

// import java.util.Iterator;
import java.util.Objects;

// 为ThreeSet设计的Person类，
// 1、实现Comparable接口
// 2、并覆写compareTo方法
public class Person2 /* extends Object */ implements Comparable<Person2> {// 比较Person2
	private int age;
	private String name;

	public Person2() {
		super();
	}

	public Person2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{" + " age='" + getAge() + "'" + ", name='" + getName() + "'" + "}";
	}

	@Override
	public boolean equals(Object obj) {
		// 不能把Object换成Person2，因为equals来自Object，而Object不用泛型
		// 必须做强制类型转换，并做健壮性判断
		System.out.println("================ Running equals ============");
		boolean result;

		if (obj == this)
			result = true;
		if (!(obj instanceof Person2)) { // 健壮性判断
			// ====== object instanceof class
			// 如果object 是 class 的一个实例，则 instanceof 运算符返回 true。
			// 如果 object 不是指定类的一个实例，或者 object 是 null，则返回 false。
			result = false; // obj不是Person2的实例，则必然this!=obj,此时obj.equals(this)为false,即result= false;
		}
		Person2 person = (Person2) obj;// 强制类型转换
		result = (this.age == person.age && Objects.equals(this.name, person.name));
		System.out.println("this:" + this + "\tobj:" + obj + "\n" + "this equals obj:\t" + result);
		return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	// 能把Object换成Person2，因为compareTo<T>，用泛型
	public int compareTo(Person2 o) { // 直接指定Object是Person2
		
		/*
		 * ===== 先不指定Object是Person2，进来之后再强制转化 public int compareTo(Object o); Person2 p
		 * = (Person2) o;
		 * 
		 * ===== return：从小到大排序。=========== -1或者负数：this<o，o排在this之后
		 * 1或者正数：this>o，o排在this之前 0：this=o, 集合中就不插入o了
		 */

		// ======= 一、按年龄排序
		Person2 p = (Person2) o;
		// 1、按年龄排序写法一
		System.out.println("\n按年龄排序:");
		int temp = this.age - p.getAge();
		return temp == 0 ? this.name.compareTo(p.getName()) : temp;
		// 2、按年龄排序写法二
		// System.out.println("\n按年龄排序:");
		// if (this.age == p.getAge()){
		// if(this.name == p.getName()){
		// return 0; // 所有对象是一样的，如果是集合的话，后续的对象就不能添加进去。
		// }else{
		// // return 1;
		// return this.name.compareTo(p.getName());
		// }
		// }else if (this.age>p.getAge()){
		// return 1;//新的年龄小于原来的年龄，排在当前的后面
		// }else {
		// return -1;
		// }

		// // ========== 二、按姓名排序
		// System.out.println("\n按姓名排序:");
		// int temp = this.name.compareTo(o.getName());
		// return temp ==0 ? (this.age-o.getAge()):temp;

	}

	
	// @Override
	// public int compareTo(Person2 o) {
	// // 自动生成的compareTo(Person2 o)方法
	// return 0;
	// }

}
