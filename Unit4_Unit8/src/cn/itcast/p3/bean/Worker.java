package src.cn.itcast.p3.bean;

// 为泛型Tool设计的Worker类，由Person2而来

public class Worker extends Person2 {

	public Worker() {
		super();
	}

	public Worker(int i, String string) {
		this.setAge(i);
		this.setName(string);
	}

	@Override
	public String toString() {
		return "{" +"Worker"+ getName() + ":"+getAge()+ "}";
	}

}
