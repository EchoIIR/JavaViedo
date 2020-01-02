package src.cn.itcast.p1.string.demo;
class StringObjectDemo{
	public static void main(String[] args) {

		// intern:返回字符串对象的规范表示。 
		String s1 = new String("abc"); // 两个对象
		String s2 = s1.intern();  // 获取字符串常量池中的数据

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		System.out.println(s1 == s2);

	}
}