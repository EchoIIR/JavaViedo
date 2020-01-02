package src.cn.itcast.p2.thread.demo;

//创建线程的方法二：实现Runnable接口
class Demo3 implements Runnable {
  private String name;
  // 1.构造函数
  Demo3(String name) {
    super();
    this.name = name;
  }
  // 2. 复写接口Runnable的run方法
  public void run() {
    this.show();
  }
  // 3. 定义放在多线程中运行的函数
  public void show() {
    for (int x = 0; x < 5; x++) {
      System.out.println(name + "...." + x +"....name..." + Thread.currentThread().getName());
    }
  }
}
class ThreadDemo3 {
  public static void main(String[] args) {
    // 定义多线程实现代码的类对象，该类中重写Runnable接口的run方法
    Demo3 d1 = new Demo3("旺财");
    Demo3 d2 = new Demo3("hahahha");
    // 定义了Thread类的对象，并传入上面的对象
    Thread t1 = new Thread(d1);
    Thread t2 = new Thread(d2);
    // 间接的调用Thread类的start方法
    t1.start();
    t2.start();
  }
}