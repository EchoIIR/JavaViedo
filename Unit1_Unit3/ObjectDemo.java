/*
	介绍了Object的几个常用方法:
		equals,hashCode,getClass,toString
	通常数据类要覆写下面方法,达到灵活使用对象:
		equals,hashCode,toString
*/
class Fu extends Object {
	Fu() {
		super();
	}
}

class Zi extends Fu {
	Zi() {
		super();
	}
}

class PersonDemo extends Object {
	private int age;

	PersonDemo(int age) {
		this.age = age;
	}

	// 比较对象的年龄=======equals() ================
	// 地址(哈希值)和内容一样
	// public boolean equals(Object obj){//向上转型隐藏子类属性
	// public boolean equals(PersonDemo obj){//或下面再转型
	/*
	 * 一般都要覆盖equals的方法,根据对象的特有内容,建立判断对象是否相等的依据.
	 */
	public boolean equals(Object obj) {
		// 复写Object的equals方法:
		// 原来返回值是比较的是地址是否相等的结果
		// 现在返回值是比较age是否相等的结果
		if (!(obj instanceof PersonDemo)) {
			// return false;
			throw new ClassCastException("类型错误");
		}
		PersonDemo p = (PersonDemo) obj;
		return this.age == p.age && this.hashCode() == p.hashCode();//地址(哈希值)和内容一样才相等
	}

	public int hashCode(){
		return this.age;
	}

	public String toString(){
		return "PersonDemo : " + age;
	}
}

class Demo {
}

class ObjectDemo {
	public static void main(String[] args) {
		Fu f = new Fu();
		Zi z = new Zi();
		Fu f2 = f;
		// ============= equals() =====================
		// 对象直接比较是比较地址
		System.out.println(f == z); // false
		System.out.println(f.equals(z)); // false
		System.out.println(f.equals(f2)); // true

		// 演示复写Object的equals方法
		System.out.println("演示复写Object的equals方法"); // false
		PersonDemo p1 = new PersonDemo(20);
		PersonDemo p2 = new PersonDemo(20);
		PersonDemo p3 = p1;
		System.out.println(p1.equals(p2)); // false
		System.out.println(p1.equals(p3)); // ture
		// 演示复写类型错误抛出异常
		System.out.println("演示复写类型错误抛出异常"); // false
		PersonDemo pp1 = new PersonDemo(20);
		Demo d1 = new Demo();
		Object O1 = new Object();
		// System.out.println(pp1.equals(d1)); // false
		// System.out.println(pp1.equals(O1)); // false

		// ============= hashCode() =====================
		System.out.println("演示hashCode()"); 
		System.out.println(pp1); // 打印hashCode值:PersonDemo@2db0f6b2
		System.out.println(Integer.toHexString(pp1.hashCode())); // 2db0f6b2

		// ============= getClass() =====================
		/*
		getClass是Class类的方法,其中Class是存的所有运行类组成的字节码类.
		*/
		System.out.println("演示getClass()"); 
		System.out.println(pp1.getClass()); // class PersonDemo
		PersonDemo pc1 = new PersonDemo(20);
		PersonDemo pc2 = new PersonDemo(60);
		Class c1 = pc1.getClass();	// 返回的是运行时类的地址
		Class c2 = pc2.getClass();
		System.out.println(c1 == c2); // class PersonDemo

		// ============= toString() =====================
		System.out.println("演示toString()"); 
		System.out.println("pp1:\t" + pp1);
		System.out.println("pp1.toString():\t" + pp1.toString()); //打印hashCode值:PersonDemo@3a4afd8d
		System.out.println("pp1.hashCode():\t" + pp1.hashCode()); //打印hashCode值:PersonDemo@3a4afd8d
		System.out.println("Integer.toHexString(pp1.hashCode()):\t" + Integer.toHexString(pp1.hashCode())); 
	}
}