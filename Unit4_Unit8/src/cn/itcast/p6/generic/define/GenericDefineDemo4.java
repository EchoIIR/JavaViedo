package src.cn.itcast.p6.generic.define;
// 实现泛型接口

class GenericDefineDemo4{
    public static void main(String[] args) {
        // 泛型接口默认方法，实现泛型接口
        InterImpl1 p1 = new InterImpl1();
        p1.show("abc");
        // 泛型接口新定义泛型方法，实现泛型接口
        InterImpl2<Integer> p2 = new InterImpl2<Integer>();
        p2.show(Integer.valueOf(4));
    }
}

interface Inter<T>{// 泛型接口
    public void show(T t);
}

// 泛型接口默认方法，实现泛型接口
class InterImpl1 implements Inter<String>{
    public void show(String str){
        System.out.println("show:" + str);
    }
}

// 泛型接口新定义泛型方法，实现泛型接口
class InterImpl2<Q> implements Inter<Q>{
    public void show(Q t){
        System.out.println("show:" + t);
    }
}