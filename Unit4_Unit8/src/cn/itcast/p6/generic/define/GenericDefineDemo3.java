package src.cn.itcast.p6.generic.define;

import src.cn.itcast.p3.bean.Student;
// import src.cn.itcast.p3.bean.Worker;

class GenericDefineDemo3{
    public static void main(String[] args) {

    // // ========== 对应Tool中的一、使用Object ========
        // Tool tool = new Tool();
        // tool.setObject(new Worker()); // 这样无报错提示，不安全
        // Student stu = (Student)tool.getObject();

    // // ========== 对应Tool中的二、使用泛型类:Tool<QQ>========
        Tool<Student> tool = new Tool<Student>();
        tool.setObject(new Student(12,"lisi1"));
        // tool.setObject(new Worker()); // 这样会报错提示，相比于一、使用Object更加安全
        Student stu = tool.getObject();
        tool.show(stu);
        tool.print(stu);
        // ======= 演示使用泛型的方法：Tool中的show：public <W> void show(W w){
        Tool<String> tool2 = new Tool<String>();
        tool2.setObject(new String("ds"));
        String str = tool2.getObject();
        tool2.show(str);
        tool2.print(str);
        
        // ==== 泛型类中的新泛型方法:show（）、默认泛型方法：print()、静态方法method()
        // 1、show方法是public <W> void show(W w)，定义了新泛型W，
        //      故虽然tool2是<String>，可以正确输出
        // 2、print方法是public void print(QQ str)，使用了Tool的泛型QQ，
        //      故Tool对象tool2是什么类型，print的参数就是什么类型

        // 3、method()方法是 public static <Y> void method(Y y)，
        //      static类型时，不能访问类上定义的静态默认泛型方法，只能定义在方法上。
        //         调用时要be accessed in a static way：Tool.method(Y y);

        // tool2.show(new Integer(4)); //警告
        // 
        tool2.show(Integer.valueOf(4)); // Tool中的重新定义泛型的方法，啥都可以show
        tool2.print(Integer.toString(4)); // 只能print和tool2一致的参数
        // tool2.method("s"); // The static method method(String) from the type Tool<String> 
        //                     //should be accessed in a static way
        Tool.method("s");
        Tool.method(Integer.valueOf(4));
    }
}