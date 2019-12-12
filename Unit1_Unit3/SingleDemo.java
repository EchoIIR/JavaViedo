/**
 * �������ģʽ 1����֤һ�������ڴ��еĶ���Ψһ��
 */
class Single {
    // �����������
    static Single s = new Single();

    // ˽�л����캯��
    private Single() {
    };

    // �����ⲿ���õķ��������ر������
    // Ŀ�ģ�ʹ�ó�Ա�����ɿ�
    public static Single getInstance() {
        return s;
    }
}




class SingleDemo {
    public static void main(String[] args) {
        // ��Ϊ���캯�������ã��������������ã���Ϊstatic��

        Single s1 = Single.getInstance(); // ָ�����s
        Single s2 = Single.getInstance(); // ָ�����s
        System.out.println(s1 == s2);   // ture

        Test t1 = new Test();
        Test t2 = new Test();
        t1.setNum(10);
        t2.setNum(20);
        System.out.println(t1.getNum());
        System.out.println(t2.getNum());
        
        // ��װ��ĵ������ģʽTestII��
        TestII tt1 = TestII.getInstance();
        TestII tt2 = TestII.getInstance();
        tt1.setNum(10);
        tt2.setNum(20);
        System.out.println(tt1.getNum());
        System.out.println(tt2.getNum());

    }
}

class Test{
    // ÿ���������ڴ��ж����Լ���λ��
    private int num;

    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }    
}

class TestII{
    // ÿ���������ڴ��ж����Լ���λ��
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
