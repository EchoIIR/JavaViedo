// 起名要注意，有重名的风险

class DuoTaiFu {
    String num = "Fu";

    void show() {
        System.out.println("Fu show");
    }

    static void showStatic() {
        System.out.println("Fu static show");
    }
}

class DuoTaiZi extends DuoTaiFu {
    String num = "Zi";

    void show() {
        System.out.println("Zi show");
    }

    static void showStatic() {
        System.out.println("Zi static show");
    }
}

class DuoTaiDemo3 {
    public static void main(String[] args) {
        DuoTaiFu f = new DuoTaiZi();

        System.out.println("\nTest1. attribute"); // Test1:多态的成员属性：
        System.out.println(f.num);      // 输出的是Fu

        System.out.println("Test2. non stactic function"); // Test2: 多态的非静态函数输出
        f.show();

        System.out.println("Test3. static function");   // 多态的静态函数输出：
        f.showStatic(); // 多态调用
        DuoTaiFu f2 = new DuoTaiFu();
        DuoTaiZi z2 = new DuoTaiZi();
        f2.showStatic(); // 类名调用
        z2.showStatic(); // 类名调用
    }
}