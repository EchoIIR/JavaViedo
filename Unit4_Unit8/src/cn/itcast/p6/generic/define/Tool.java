package src.cn.itcast.p6.generic.define;


// 定义工具类用于操作所有对象方案：
// ========== 一、使用Object ========
//  使用Object优点：提高程序拓展性
//            缺点：强制类型转换会报错。
// ========== 二、使用泛型类<> ======



// // ========== 一、使用Object ========
// class Tool {
//     //
//     private Object object;
//     public Object getObject(){
//         return object;
//     }
//     public void setObject(Object object) {
//         this.object = object;
//     }
// }

// ========== 二、使用泛型类:Tool<QQ> ======
public  class Tool<QQ> {
    //
    private QQ qq;
    public QQ getObject(){
        return qq;
    }
    public void setObject(QQ qq) {
        this.qq = qq;
    }

    // 新泛型方法:show（）:把泛型定义在方法上,传入啥类型的引用参数都可以
    public <W> void show(W w){
        System.out.println("show:" + w.toString());
    }
    // 默认泛型方法：print()：只能传入泛型类Tool对象tool同类型的引用参数
    public void print(QQ str){
        System.out.println("print:" + str);
    }
    // 静态泛型方法：不能访问类上定义的静态默认泛型方法，只能定义在方法上
    public static <Y> void method(Y y){
    // public static void method(QQ y){ // 不能访问类上定义的静态默认泛型方法
        System.out.println("static method:" + y.toString());
    }


}