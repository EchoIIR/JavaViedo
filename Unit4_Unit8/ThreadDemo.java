/* 
进程： 正在运行的程序，占内存。
*/
class Demo extends Object{
	public void finalize(){
		// 当垃圾回收器确定不存在对该对象的更多引用时，
		// 由对象的垃圾回收器调用此方法。
		// gc()运行垃圾回收器
		System.out.println("demo ok");
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		new Demo();
		new Demo();
		new Demo();
		System.gc();	// gc()运行垃圾回收器
		new Demo();
		System.out.println("Hello world.");
	}
}