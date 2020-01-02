package src.cn.itcast.p2.thread.demo;

// 买票：
// 需求：多个人，买票----》多线程
//      一张票，有人买了，其他人就不能再买了。

// 方法一
// class Ticket extends Thread{
//    private int num = 10;   //票数
//   private static int num = 20;   //定义为static类型后，大家共享票，不会出现一票多人
//   public void run(){
//     while(true){
//       if(num > 0){
//         System.out.println(Thread.currentThread().getName() + "....sale..."+ num--);
//       }
//     Thread}
//   }
// }

// 方法二
class Ticket implements Runnable {
  private int num = 20; // 票数
  // private static int num = 20; //定义为static类型后，大家共享票，不会出现一票多人
  Object obj = new Object();
  boolean flag = false;

  public void run() {
    if (flag) {
      while (true) {
        show();
      }
    } 
    else {
      while (true) {
        synchronized (obj) {
          if (this.num > 0) {
            System.out.println(Thread.currentThread().getName() + "....obj sale..." + this.num--);
          }
        }
      }

    }

  }

  // 同步函数防止多线程公用数据时发生错误
  public synchronized void show() {
    if (this.num > 0) {
      System.out.println(Thread.currentThread().getName() + "....function sale..." + this.num--);
    }
  }
}

class TicketDemo {
  public static void main(String[] args) {
    // 展示方法二
    Ticket t = new Ticket();

    Thread t1 = new Thread(t);
    Thread t2 = new Thread(t);
    Thread t3 = new Thread(t);
    Thread t4 = new Thread(t);
    t1.start();
    t2.start();
    t.flag = true;
    t3.start();
    t4.start();

    // 展示方法一
    // Ticket t1 = new Ticket();
    // Ticket t2 = new Ticket();
    // Ticket t3 = new Ticket();
    // Ticket t4 = new Ticket();

    // t1.start();
    // t2.start();
    // t3.start();
    // t4.start();

  }
}