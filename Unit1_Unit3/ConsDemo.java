class ConsDemo{
    public static void main(String [] args){
        // 定义一个对象就调用构造函数
        Person p1 = new Person();
        p1.speak(); 
        // 
        Person p2 = new Person("wc");
        p2.speak(); // 
        Person p3 = new Person(5);
        p3.speak(); // 
        Person p4 = new Person("wc",5);
        p4.speak(); // 
        Person p5 = new Person(5,"wc");
        p5.speak(); // 
    }
}
class Person{
    private String name;
    private int age;
    // 定义构造函数
    // (可同时定义多个构造函数)
    // 即重载
    Person(){
        name = "baby";
        age = 1;
        System.out.println("\nperson1 run");
    }
    Person(String n){
        name = n;
        System.out.println("\nperson2 run");
    }
    Person(int a){
        age = a;
        System.out.println("\nperson3 run");
    }
    Person(String n,int a){
        name = n;
        age = a;
        System.out.println("\nperson4 run");
    }
    Person(int a,String n){
        name = n;
        age = a;
        System.out.println("\nperson5 run");
    }
    // 定义一般函数
    public void speak(){
        System.out.println(name + ":" + age);
    }
}