class Outer{

    // static class Inner时不能运算非static变量
    private static int num = 3;

    static class Inner{
        // 内部类，内部方法
        void show(){
        //    System.out.print("show run " + num);
            System.out.print("show run " + num); 
        }
        static void function(){
            //  内部类中有static方法，则该内部类必须是static
                System.out.println("\n\n4.visit static Inner static function:");
                System.out.print("Outer.Inner.function(): \nfunction run "); 
            }
    }
    public void method(){
        // 提供内部类对外访问方法
        Inner in  = new Inner();
        in.show();
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        
        // == 访问外部类中：non static内部类的non static属性
        Outer u1 = new Outer();
        System.out.println("\n1.visit Inner by Outer's instance:");
        u1.method();
        // == 访问外部类中：non static内部类中non static方法
        // System.out.println("\n\n2.visit Inner by Inner's instance:");
        // Outer.Inner in = new Outer().new Inner();
        // in.show();

        // == 访问外部类中： static内部类中non static方法
        System.out.println("\n\n3.visit static Inner by Inner's instance:");
        Outer.Inner in2 = new Outer.Inner();
        in2.show();
        // == 访问外部类中：static内部类中static方法
        Outer.Inner.function();
    }
}