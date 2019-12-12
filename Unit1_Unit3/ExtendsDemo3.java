class ExtendsDemo3{
    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println("\nPhone:");
        p1.show();

        NewPhone p2 = new NewPhone();
        System.out.println("\nNewPhone:");
        p2.show();
        
    }
}

class Phone{
    void call() {}

    void show(){
        System.out.println("number");
    }
}


class NewPhone extends Phone { 

    void show(){
        super.show();// 保留父类中show原有方法
        System.out.println("picture");
        System.out.println("name");
    }
}