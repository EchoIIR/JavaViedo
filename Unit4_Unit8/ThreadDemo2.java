/*

*/

class Demo2 extends Thread {
  private String name;

  // 1.构造函数
  Demo2(String name) {
    this.name = name;
  }

  // 2. 复写Thread类的run方法
  public void run() {
    this.show();
  }

  // 3. 定义放在多线程中运行的函数
  public void show() {
    for (int x = 0; x < 5; x++) {
      System.out.println(name + "...." + x);
    }
  }
}

class ThreadDemo2 {
  public static void main(String[] args) {
    Demo2 d1 = new Demo2("旺财");
    Demo2 d2 = new Demo2("hahahha");

    d1.start(); // 1.创建线程 2. 调用run方法
    d2.start();
  }
}