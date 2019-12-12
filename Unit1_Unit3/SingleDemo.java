/**
 * 单例设计模式 1、保证一个类在内存中的对象唯一性
 */
class Single {
    // 创建本类对象
    static Single s = new Single();

    // 私有化构造函数
    private Single() {
    };

    // 定义外部调用的方法，返回本类对象
    // 目的：使得成员函数可控
    public static Single getInstance() {
        return s;
    }
}




class SingleDemo {
    public static void main(String[] args) {
        // 因为构造函数不可用，所以用类名调用（设为static）

        Single s1 = Single.getInstance(); // 指向对象s
        Single s2 = Single.getInstance(); // 指向对象s
        System.out.println(s1 == s2);   // ture

        Test t1 = new Test();
        Test t2 = new Test();
        t1.setNum(10);
        t2.setNum(20);
        System.out.println(t1.getNum());
        System.out.println(t2.getNum());
        
        // 改装后的单例设计模式TestII类
        TestII tt1 = TestII.getInstance();
        TestII tt2 = TestII.getInstance();
        tt1.setNum(10);
        tt2.setNum(20);
        System.out.println(tt1.getNum());
        System.out.println(tt2.getNum());

    }
}

class Test{
    // 每个对象在内存中都有自己的位置
    private int num;

    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }    
}

class TestII{
    // 每个对象在内存中都有自己的位置
    static TestII t = new TestII();
    private int num;
    private TestII(){};
    
    public static TestII getInstance(){
        return t;
    }


    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }    
}
