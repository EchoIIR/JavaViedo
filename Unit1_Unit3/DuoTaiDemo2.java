
class 毕姥爷{
    public static void 讲课(){
        System.out.println("管理");
    }
    public static void 钓鱼(){
        System.out.println("钓鱼");
    }
}

class 毕老师 extends 毕姥爷{
    public static void 讲课(){
        System.out.println("Java");
    }
    public static void 看电影(){
        System.out.println("看电影");
    }
}


class DuoTaiDemo2{
    public static void main(String[] args) {
        // 向上转型：限制功能使用
        毕姥爷 b = new 毕老师(); 
        b.钓鱼();
        b.讲课();
        // b.看电影();

        // 向下转型：使用特殊功能
        毕老师 b1 = (毕老师) b;
        b1.看电影();
     
    }
}