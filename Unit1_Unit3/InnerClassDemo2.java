class Outer2{
    int num = 3;
    class Inner2{
        int num = 4;
        void show2(){
            int num = 5;
            System.out.println("num:" + num);// 5
            System.out.println("this.num:" + this.num);//4
            System.out.println("Inner2.this.num:" + Inner2.this.num);//4
            System.out.println("Outer2.this.num:" + Outer2.this.num);//3
        }
    }
    void method2(){
        new Inner2().show2(); 
    }
}
class InnerClassDemo2{
    public static void main(String[] args) {
        new Outer2().method2();
    }
}