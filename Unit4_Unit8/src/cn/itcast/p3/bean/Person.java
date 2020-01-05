package src.cn.itcast.p3.bean;

import java.util.Objects;

public class Person extends Object {
	private int age;
	private String name;

	public Person() {
		super();
	}

	public Person(int age, String name) {
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
	public boolean equals(Object obj) {
		System.out.println("================ Running equals ============");
		boolean result;
		
		if (obj == this)
			result= true;
		if (!(obj instanceof Person)) {
			// ====== object instanceof class
			// 如果object 是 class 的一个实例，则 instanceof 运算符返回 true。
			// 如果 object 不是指定类的一个实例，或者 object 是 null，则返回 false。
			// 
			result= false; // obj不是Person的实例，则必然this!=obj,此时obj.equals(this)为false,即result= false; 
		}
		Person person = (Person) obj;
		result = (this.age == person.age && Objects.equals(this.name, person.name));
		System.out.println("this:" + this +"\tobj:" + obj + "\n"+ "this equals obj:\t"  + result);
		return result;
	}

	// @Override
	// public int hashCode() {
	// 	System.out.println("\n................Running hashCode..............");
	// 	System.out.println(this.toString() + "..hashCode..." + Objects.hash(age, name));
	// 	return Objects.hash(age, name);
	// }

	// @Override
	// public String toString() {
	// 	return "{" +
	// 		" age='" + getAge() + "'" +
	// 		", name='" + getName() + "'" +
	// 		"}";
	// }

}
