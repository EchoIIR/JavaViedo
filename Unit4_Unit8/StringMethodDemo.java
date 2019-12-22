package cn.itcast.pl.string.demo;

class StringMethodDemo{
	public static void main(String[] args) {
		System.out.println("hello world.");
		stringMethodDemo();
	}
	public static void stringMethodDemo(){
		String s = "abcdecfa";
		System.out.println("s:" + s);
		System.out.println("length:" + s.length());
		System.out.println("char:" + s.charAt(2));
		System.out.println("index:" + s.indexOf("c"));
		System.out.println("lastIndex:" + s.lastIndexOf("a"));

	}
}