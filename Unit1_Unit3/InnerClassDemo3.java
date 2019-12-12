/*
 * 匿名内部类：内部类的简写格式 前提：内部类必须继承或者实现一个外部类或者接口
 * 
 */
class InnerClassDemo3 {
    public static void main(String[] args) {
        // ==== 内部类的使用
        OuterInter t1 = new OuterInter();
        t1.method();

        // ==== 匿名内部类的使用
        new OuterNiMing().method();
    }

}  

//（这样抽象内部类可以改写为匿名类）
abstract class Demo{
    abstract void show();
}

// ====  一、内部类实现抽象父类
class OuterInter {
    int num = 4;
    class Inner extends Demo
    {// 内部类
        void show() 
        {//覆盖内部类的方法
            System.out.println("\n\nDemo 3 show InnerClass..." + num);
        }
    }

    public void method()
    {// 实例化内部类的方法，提供给外部的方法接口
        new Inner().show();
    }
}

/* ==== 二、匿名内部类实现抽象父类
匿名内部类通常使用场景之一：
当函数参数是接口类型，且接口中的方法不超过3个可以使用匿名内部类作为实际参数进行传递
 */
class OuterNiMing {
    int num = 4;
    public void method(){
    // ====== 匿名内部类
    // 直接new父对象同时实现其方法
        new Demo(){
            void show() {
                System.out.println("\n\nDemo 3 show NimingClass...." + num);
            }
        }.show();
    // 内部类：new Inner().show();
    }
}