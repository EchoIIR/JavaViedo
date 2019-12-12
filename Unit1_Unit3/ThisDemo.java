class Person{
    private String name;
    private int age;
    Person(){
        name = "baby";
        age = 5;
        System.out.println("person run1"); 
    }
    Person(String name, int age){
       // name     = name;
       // 局部变量 和 成员变量冲突了,用this区分
        this.name = name;
        this.age = age;
        System.out.println("person run2"); 
    }
    public void speak(){
        System.out.println(name + " :" + age); 
    }
}
class ThisDemo {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
    }
}