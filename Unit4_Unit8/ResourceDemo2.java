//================ 多线程的安全问题：同步锁 =========
// 1. 同步锁加了不起作用
// 2. 考虑同步锁的前提：
//		在同一个锁里有多个线程。
// =============== 多线程的等待唤醒机制 ============
// 1.
// 2. 

class Resource2 {
	private String name;
	private String sex;
	private boolean flag = false;

	public synchronized void set(String name,String sex){
		if(flag)
			try{r.wait();}catch(InterruptedException e){}
		this.name = name;
		this.sex = sex;
		flag = true;
	}

	public synchronized void out(){
		System.out.println(name + "..." + sex);
	}
}

// 输入
class Input implements Runnable {
	Resource2 r;
	Input(Resource2 r) {
		this.r = r;
	}

	public void run() {
		int x = 0;
		while (true) 
		{
			synchronized (r) 
			{
				if(r.flag){
					try{r.wait();}catch(InterruptedException e){}
				}
				if (x == 0) {
					r.name = "mike";
					r.sex = "nan";
				} else {
					r.name = "丽丽";
					r.sex = "女女女女女女";
				}
				r.flag = true;
				r.notify();
				
			}
			x = (x + 1) % 2;
		}

	}
}

// 输出
class Output implements Runnable {
	Resource2 r;

	Output(Resource2 r) {
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

class ResourceDemo2 {
	public static void main(String[] args) {
		// 创建资源
		Resource2 r = new Resource2();// 煤
		// 创建任务
		Input in = new Input(r); // 大卡车1
		Output out = new Output(r); // 大卡车2
		// 创建线程，执行路径
		Thread t1 = new Thread(in); // 大卡车1在高速1
		Thread t2 = new Thread(out); // 大卡车2在高速2
		// 开启线程
		t1.start();
		t2.start();
	}
}