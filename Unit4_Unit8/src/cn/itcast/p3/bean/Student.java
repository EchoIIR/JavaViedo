package src.cn.itcast.p3.bean;

// 为Map设计的Person类，由Person2而来
// 1、添加了籍贯的属性
public class Student extends Person2 {

	public Student() {
		super();
	}

	public Student(int i, String string) {
		this.setAge(i);
		this.setName(string);
	}

	@Override
	public String toString() {
		return "{" +"Sutendt"+ getName() + ":"+getAge()+ "}";
	}

}
