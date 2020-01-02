package src.cn.itcast.p1.string.demo;

class StringConstructorDemo{
	public static void main(String[] args) {
		System.out.println("hello world.");

		stringConstructorDemo();
	}

	public static void stringConstructorDemo(){
		String s = new String(); //等效于String s ="";
								 //不等效于String s =null;
		System.out.println("s = " + s);

		byte [] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1 = " + s1);

		char [] arr2 = {'w','a','b','x'};
		String s2 = new String(arr2);
		System.out.println("s2 = " + s2);

		char [] arr3 = {'w','a','b','x','d'};
		String s3= new String(arr3,1,3); // 指定始末
		System.out.println("s3= " + s3);

	}
}