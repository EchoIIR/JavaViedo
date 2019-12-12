class DuoTaiDemo{
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
     // 自动类型转型，提升了动物类型，但是特有功能无法访问        
        Animal p = new Pig();

        c.eat();
        d.eat();
        p.eat();     

        method(c);
        method(d);
        method(p);

        // 向下转型，可以使用子类中的特有方法,可以向下转型的前提是他本来就是“下”
        Pig p1 = (Pig)p;
        p1.gongdi();

        // 
        Dog d2 = new Dog();
        System.out.println("dog:");
        method2(d2);
        Cat c2 = new Cat();
        System.out.println("cat:");
        method(c2);

    }

    // ======== 多态的实现 =============
    // public static void method(Cat c){
    //     c.method();
    // }
    // public static void method(Dog d){
    //     d.method();
    // }
    public static void method(Animal a){
        // 多个对象
        a.eat();
         // 只能用于引用数据类型判断
        if (a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
        }
    }

    public static void method2(Animal a){
        // 多个对象
        a.eat();
         // 只能用于引用数据类型判断
        if (a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse();
           
        }
    }

}


// ======== 抽象类及其子类 ===========
abstract class Animal{
    abstract void eat();
}

class Dog extends Animal{
    void eat(){
        System.out.println("eat bone");
    }
    void lookHome(){
        System.out.println("look home");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("eat fish");
    }
    void catchMouse(){
        System.out.println("catch mouse");
    }
}

class Pig extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
    void gongdi(){
        System.out.println("gongdi");
    }
}