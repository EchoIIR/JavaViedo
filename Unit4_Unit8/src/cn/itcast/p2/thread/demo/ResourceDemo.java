package src.cn.itcast.p2.thread.demo;

// 多线程的安全问题：同步锁
// 1. 同步锁加了不起作用
// 2. 考虑同步锁的前提：
//		在同一个锁里有多个线程。

class Resource {
	String name;
	String sex;
}

class Input2 implements Runnable {
	Resource r;

	Input2(Resource r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		while (true) {
			synchronized (r) {
				if (x == 0) {
					r.name = "mike";
					r.sex = "nan";
				} else {
					r.name = "丽丽";
					r.sex = "女女女女女女";
				}
				x = (x + 1) % 2;
			}
		}

	}
}

// 输出
class Output2 implements Runnable {
	Resource r;

	Output2(Resource r) {
		this.r = r;
	}

	public void run() {

		while (true) {
			synchronized (r) {
				System.out.println(r.name + "...." + r.sex);
			}
		}

	}
}

class ResourceDemo {
	public static void main(String[] args) {
		// 创建资源
		Resource r = new Resource();// 煤
		// 创建任务
		Input2 in = new Input2(r); // 大卡车1
		Output2 out = new Output2(r); // 大卡车2
		// 创建线程，执行路径
		Thread t1 = new Thread(in); // 大卡车1在高速1
		Thread t2 = new Thread(out); // 大卡车2在高速2
		// 开启线程
		t1.start();
		t2.start();
	}
}