package src.cn.itcast.p6.generic.define;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import src.cn.itcast.p3.bean.Person2;
import src.cn.itcast.p3.bean.Student;
import src.cn.itcast.p3.bean.Worker;

class GenericDefineDemo5 {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<Integer>();
        al1.add(5);
        al1.add(67);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("xixi");
        al2.add("haha");



        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(new Worker(43, "lisi1"));
        workers.add(new Worker(32, "lisi2"));

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(13, "xiaoming1"));
        students.add(new Student(17, "xiaoming2"));
        
        ArrayList<Person2> person2s = new ArrayList<Person2>();
        person2s.addAll(workers);
        person2s.addAll(students);
        
        System.out.println("\n1、泛型通配符<?>打印结果：");
        printCollection1(al1);
        printCollection1(al2);
        printCollection1(workers);
        printCollection1(students);

        System.out.println("\n2、泛型<T>打印结果：");
        printCollection2(al1);
        printCollection2(al2);
        printCollection2(workers);
        printCollection2(students);

        
        System.out.println("\n3、打印一种类型:Student,泛型<Student>打印结果：");
        // printCollection3(al1);
        // printCollection3(al2);
        // printCollection3(workers);
        printCollection3(students);

        
        
        System.out.println("\n4、上限：打印Person2及其子类 <? extends Person2>打印结果：");
        // printCollection3(al1);
        // printCollection3(al2);
        printCollection4(workers);
        printCollection4(students);

                
        System.out.println("\n5、下限：打印Student及其父类 <? super Student>打印结果：");
        // printCollection3(al1);
        // printCollection3(al2);
        printCollection5(person2s);
        printCollection5(students);

    }

    // 打印全部类型：泛型通配符:<?>,不能返回？类型
    private static void printCollection1(Collection<?> al2) {
        Iterator<?> it = al2.iterator();
        while (it.hasNext()) {
            // String str = (String) it.next();// ? str = (?) it.next();
            System.out.println("Collection<?>:\t" + it.next());
        }
    }

    // 打印全部类型：泛型:<T>，可以返回T类型。
    private static <T> void printCollection2(Collection<T> al2) {
        Iterator<T> it = al2.iterator();
        while (it.hasNext()) {
            T t = it.next();// ? str = (?) it.next();
            System.out.println("Collection<T>:\t" + t);
        }
    }

    // 打印一种类型:Student
    private static void printCollection3(Collection<Student> al3) {
        Iterator<Student> it = al3.iterator();
        while (it.hasNext()) {
            Student student = it.next();// ? str = (?) it.next();
            System.out.println("Collection<Student>:\t" + student);
        }
    }
    //  上限：打印E及其子类 <? extends E>
    private static void printCollection4(Collection<? extends Person2> al4) {
        Iterator<? extends Person2> it = al4.iterator();
        while (it.hasNext()) {
            Person2 person = it.next();// ? str = (?) it.next();
            System.out.println("Collection<? extends Person2>:\t" + person);
        }
    }
    //  下限：打印E及其父类 <? super E>
    private static void printCollection5(Collection<? super Student> al5) {
        Iterator<? super Student> it = al5.iterator();
        while (it.hasNext()) {
            Object person = it.next();// ? str = (?) it.next();
            System.out.println("Collection<? super Student>:\t" + person);
        }
    }
}