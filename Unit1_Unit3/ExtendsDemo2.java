class Fu{
// ========== 父子类中：成员变量的几个考点 =======
    int num1 = 4;
    int num = 4;
    private int numPrivate = 2;

    public int getNumPrivate(){
        return numPrivate;
    }
// ========== 父子类中：成员函数的几个考点 =======
    void show1(){
        System.out.println("fu show run");
    }

    void showFun(){
        System.out.println("fu show run");
    }
}

class Zi extends Fu{
    // ========== 父子类中：成员变量的几个考点 =======
    int num2 = 5;
    int num = 5;
    public void show(){
        // 成员函数
        System.out.println(num2 + "..." + num1);// 5...4
        // 子类有的成员变量就不找父类成员变量(同名不是覆盖)
        System.out.println(num + "..." + num);//5...5
        // 子类成员变量与父类成员变量重名用super区分
        System.out.println(this.num + "..." + super.num);
        // 子类间接访问父类私有成员变量
        System.out.println("numPrivate:" + this.getNumPrivate());
    }

    // ========== 父子类中：成员函数的几个考点 =======
    void show2(){
        System.out.println("Zi show run");
    }

    void showFun(){
        System.out.println("Zi show run");
    }
    
}

class ExtendsDemo2{
    public static void main(String[] args) {
        Zi z = new Zi();
        // 成员变量test
        z.show();
        // 成员函数test
        z.show1(); //
        z.show2();
        z.showFun();

    }
}