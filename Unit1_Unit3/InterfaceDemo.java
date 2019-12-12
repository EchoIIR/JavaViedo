class InterfaceDemo{
    public static void main(String[] args) {
        // 1、接口的测试
        System.out.println("\nTest1:"); // 10 
        DemoImp1 d = new DemoImp1();
        // 接口直接调用类的属性
        System.out.println("interface Demo: Demo.NUM = "+Demo.NUM);// 接口
        // 实现接口的类名调用接口属性
        System.out.println("class DemoImp1.Num: DemoImp1.NUM = "+ DemoImp1.NUM);
        // 实现接口的类的实例化对象调用接口属性
        System.out.println("instance of class DemoImp1: d.NUM = "+ d.NUM);         

        // 2、接口实现多继承机制-多实现
        System.out.println("\nTest2:"); // 10 
        TestMulitImplement t = new TestMulitImplement();
        t.show();
        
        // 3、一个类继承另一个类，同时实现多个接口
        System.out.println("\nTest3:"); // 10 
        TestMulitImplement2 t2 = new TestMulitImplement2();
        t2.show(); // 接口的方法
        // 父类的方法
        int a = t2.add(2, 3);
        System.out.println( a);   // 5 转义字符要用双引号，否则当做ASCII码参与运算，如下输出为21
        //System.out.println('\n'+ a); // 15
        //System.out.println('\n'+ 0); // 10 

        // 4、接口与接口之间是继承
        System.out.println("\nTest4:"); // 10 
        TestMulitImplement3 t3 = new TestMulitImplement3();
        t3.method1();
        t3.method2();
        t3.method3();
    }
}
// ========= 1、接口定义与应用 =========
interface Demo 
{// 成员有特定的修饰符(可以省略，但最好保留)：
    public static final int NUM = 4; // 全局变量：public static final
    public abstract void show1();   // 抽象方法：public abstract
    public abstract void show2();    
}

class DemoImp1 implements Demo {
    public void show1(){}
    public void show2(){}
}

// ========= 2、接口实现java多继承的机制 =========
interface A{
    public void show();
}

interface B {
    public void show();
}
class TestMulitImplement implements A,B{
    public void show() {
        System.out.println("implements two interfaces");
    }
}

// ========= 3、一个类继承另一个类，同时实现多个接口 =========
class Q{
    public int add(int a,int b){
        return a+b;
    }
}
class TestMulitImplement2 extends Q implements A,B{
    public void show(){
        System.out.println("implements two interfaces and extends one superClass");
    }
}

// ========= 4、接口与接口之间是继承 =========
interface CC{
    void method1();
}
interface MM{
    void method2();
}
interface QQ extends CC,MM{
    void method3();
}
class TestMulitImplement3 implements QQ{
    // QQ共有3个方法，所以要实现其三个方法
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
}