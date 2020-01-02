package src.cn.itcast.p2.thread.demo;

// 需求： 储户，两个
//        每个都到银行存钱每次存100，存3次

class Bank{
  private int sum = 0;

  //====== 同步代码块实现同步 ============
  // Object obj = new Object();
  // public void add(int num){// add是多线程的代码，有共享数据
  //   synchronized(obj){   //用同步的方法，加一个锁  
  //     sum = sum + num;
  //     System.out.println("bank sum = " + sum);
  //   }
  // }

    //====== 同步函数实现同步 ============
    
    public synchronized void  add(int num){// add是多线程的代码，有共享数据
        sum = sum + num;
        System.out.println("bank sum = " + sum);
    }
}

// 定义类实现Runnable，用于放线程的内容
class Cus implements Runnable{  
  private Bank b = new Bank ();
  public void run(){
    // Bank b = new Bank ();
    for (int x = 0 ; x< 3; x++){
      b.add(100); // add也是进程的代码
    }
  }
}

class BankDemo{
  public static void main(String[] args) {
    // 实例化Runnable子类的对象
    Cus c = new Cus();
    // 创建线程的对象，并传入Runnable子类的对象作为线程的内容
    Thread t1 = new Thread(c);
    Thread t2 = new Thread(c);
    // 通过Thread对象，运行多线程
    t1.start();
    t2.start();
    
  }
}