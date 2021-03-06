package src.cn.itcast.p2.thread.demo;

// 买票：
// 需求：多个人，买票----》多线程
//      一张票，有人买了，其他人就不能再买了。

// 1. 搞清该同步那个部分：run? show？
//		如果同步run则0线程进来之后出不去，因为while (true)始终成立。
//		所以需要同步的是show()函数

// 2. 验证同步函数的锁
//		Thread-0在同步函数中买票
//		Thread-1在同步代码块中买票
//		如果两个Thread用的同一个锁的话就不会有安全隐患，这个通过flag实现。

class SynStaticFunctionDemoTicket implements Runnable {
	private static int num = 20; // 票数
	static boolean flag = true;
	public void run() {
		if (flag) {// flag为true，Thread-0同步代码块买票
			while(true){
				// synchronized (SynStaticFunctionDemoTicket.class) {
				synchronized (this.getClass()) {
					if (num > 0) {
						try {Thread.sleep(10);} catch (InterruptedException e) {}
						System.out.println("flag:" + flag + " " + Thread.currentThread().getName()
						+ "....SynFunction obj..." + num--);
					}
				}				
			}
		} else {// flag为false，Thread-1同步函数show买票
			while (true) {
				SynStaticFunctionDemoTicket.show();
			}
		}
	}
	public static synchronized void show() {// 同步函数防止多线程公用数据时发生错误
		if (num > 0) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			System.out.println(
					"flag:" + flag + " " + Thread.currentThread().getName() 
					+ "....SynFunction fun..." + num--);
		}
	}
}
class SynStaticFunctionLockDemo {
	public static void main(String[] args) {
		// 将并行处理的部分作为参数传给多线程的类Thread
		SynStaticFunctionDemoTicket tt = new SynStaticFunctionDemoTicket(); 
		Thread tt1 = new Thread(tt);
		Thread tt2 = new Thread(tt);
		tt1.start();
		// 在主线程开启了-0之后，把flag置为假之前，让主线程停一下，就剩-0线程运行
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		SynStaticFunctionDemoTicket.flag = false;
		tt2.start();
	}
}