package src.cn.itcast.p3.bean;

import java.util.Objects;
// 为ThreeSet设计的Person类，
// 1、实现Comparable接口
// 2、并覆写compareTo方法
public class Person2 /*extends Object*/ implements Comparable<Object>{
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
		return "{" +
			" age='" + getAge() + "'" +
			", name='" + getName() + "'" +
			"}";
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("================ Running equals ============");
		boolean result;
		
		if (obj == this)
			result= true;
		if (!(obj instanceof Person2)) {
			// ====== object instanceof class
			// 如果object 是 class 的一个实例，则 instanceof 运算符返回 true。
			// 如果 object 不是指定类的一个实例，或者 object 是 null，则返回 false。
			// 
			result= false; // obj不是Person2的实例，则必然this!=obj,此时obj.equals(this)为false,即result= false; 
		}
		Person2 person = (Person2) obj;
		result = (this.age == person.age && Objects.equals(this.name, person.name));
		System.out.println("this:" + this +"\tobj:" + obj + "\n"+ "this equals obj:\t"  + result);
		return result;
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public int compareTo(Object o) {
		/*==== return：从小到大排序。
	-1或者负数：this<o，o排在this之后
	 1或者正数：this>o，o排在this之前
			 0：this=o, 集合中就不插入o了
		*/  

		// ======= 按年龄排序
		Person2 p = (Person2) o;
		// =============== 写法一 =============
		// System.out.println("\n按年龄排序:");
		// if (this.age == p.getAge()){
		// 	if(this.name == p.getName()){
		// 		return 0; // 所有对象是一样的，如果是集合的话，后续的对象就不能添加进去。
		// 	}else{
		// 		// return 1;
		// 		return this.name.compareTo(p.getName());
		// 	}
		// }else if (this.age>p.getAge()){
		// 	return 1;//新的年龄小于原来的年龄，排在当前的后面
		// }else {
		// 	return -1;
		// }	
		
		// ============= 写法二 ==================
		// System.out.println("\n按年龄排序:");
		// int temp = this.age - p.getAge();	
		// return temp ==0 ? this.name.compareTo(p.getName()):temp;
		
		// 按姓名排序
		// System.out.println("\n按姓名排序:");
		int temp = this.name.compareTo(p.getName());	
		return temp ==0 ? (this.age-p.getAge()):temp;


	}
}
