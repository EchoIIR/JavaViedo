// // 饿汉式
// class Single{
// 	private static final Single s = new Single();
// 	private Single(){}
// 	public static Single getInstance(){
// 		return s;
// 	}
// }

// 懒汉式(面试！！！)
class Single {
	private static Single s = null;

	private Single() {
	}

	public static Single getInstance() {
		// 共享数据
		// 多条语句操作共享数据
		if (s == null) {
			synchronized (Single.class) {
				if (s == null) {
					s = new Single();
				}
			}
		}
		return s;
	}
}

//
class SingleDemo {
	public static void main(String[] args) {
		System.out.println("Hello world.");
	}
}