class PersonE{
    int age = 10;
    String name = "Tom";

}

class Student extends PersonE{
    void study(){
        System.out.println(name + " is " + age + ",and studys hard.");
    }
}

class Worker extends PersonE{
    void work(){
        System.out.println(name + " is " + age + ",and works hard.");
    }
}

class ExtendsDemo{
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Student s1 = new Student();
        w1.work();
        s1.study();
    }
}