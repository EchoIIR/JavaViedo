class CarDemo {

    public static void main(String[] args) {
        // 创建Car实例
        Car c = new Car(); //
        //c.run();
        show(c);

        c.color = "red";
        c.num = 8;
        c.run();


     }
    // 类类型参数
    public static void show(Car c) {
        // 类类型的变量一定指向对象，否则为null
        c.color = "red";
        c.num = 8;
        System.out.println(c.num + "...show..." + c.color);
    }

}

class Car {
    int num = 10;
    String color;

    void run() {
        System.out.println(num + "..." + color);
    }

}