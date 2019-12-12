abstract class Employee {
    private String name;
    private double pay;
    // 可以通过实例化对象调用
    public String id;

    Employee(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public String getName() {
        return this.name;
    }

    // 抽象方法，没有方法体，有abstract关键字做修饰
    abstract public void work();
}

class Manager extends Employee {
    // 额外的属性
    private int age;
    private int bonus;

    Manager(String name, String id, double pay, int age, int bonus) {
        super(name, id, pay);
        this.age = age;
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("manage...");
    }
}

class AbstractTest {
    public static void main(String[] args) {
        Manager m = new Manager("Enzo", "10", 50000, 26, 2332);
        // 抽象类的子类实例化对象，赋值给抽象类
        Employee e = new Manager("Echo", "3", 1000, 26, 45);
        // 父类抽象方法的调用
        m.work();
        // 父类普通方法的调用
        System.out.println(m.getName());

        System.out.println(e.getName());
        // Employee中public的属性、方法，均可以通过对象实例调用
        System.out.println(e.id);
    }
}
