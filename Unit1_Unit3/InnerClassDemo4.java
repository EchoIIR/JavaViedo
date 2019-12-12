class InnerClassDemo4 {
    public static void main(String[] args) {
        // ==== 内部类的使用
        Outer4 t1 = new Outer4();
        t1.method1();

        // ==== 匿名类的使用

        // 法一、通过外部类的对象调用方法实现
        t1.method2();

        // 法二、通过传入接口实例化对象，直接实现接口方法
        show(new Inter4() {
            public void show1() {
                System.out.println("\n\nNimingClass show1 in main");
            }

            public void show2() {
                System.out.println("NimingClass show2 in main");
            }
        });

    }

    public static void show(Inter4 in) {
        in.show1();
        in.show2();
    }

}

interface FuInter4 {
    void show1();
    void show2();
}

class Outer4 {
    // ==== 一、内部类实现接口
    class Inner4 implements FuInter4 {
        public void show1() {
            System.out.println("\n\nInner4Class show1");
        }

        public void show2() {
            System.out.println("Inner4Class show2");
        }
    }

    public void method1() {
        // 内部类
        FuInter4 in1 = new FuInter4();
        in1.show1();
        in1.show2();
    }
    // ==== 二、 匿名类（直接实现父类对象对应的方法）
    public void method2() {
        Inter4 in2 = new Inter4() {
            public void show1() {
                System.out.println("\n\nNimingClss show1");
            }
            public void show2() {
                System.out.println("NimingClss show2");
            }
        };
        in2.show1();
        in2.show2();
    }

}