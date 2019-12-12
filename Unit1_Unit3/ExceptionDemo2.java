// 自定义抛出异常与JVM抛出异常演示
// > 异常的分类：
// > * 编译时被检测异常：只要是Exception和其子类都是，除了特殊子类RuntimeException体系
// > * 编译时不检测异常：就是Exception中的RuntimeException和子类。


class Demo{
    public int method(int[] arr, int index) throws FuShuException{
        // 数组为空的异常
        if (arr == null){
            throw new NullPointerException("数组不能为空");
        }
        // 数组角标越界异常
        if (index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("my Exception:"+index);
        }
        // 数组角标为负数的异常
        // if (index <0){
        //     throw new ArrayIndexOutOfBoundsException("my Exception:"+index);
        // }
        
        // 自定义负数角标异常
        if (index < 0){
            //throw new FuShuException("角标为负数啦");
            throw new FuShuException();
        }

        return arr[index];
    }
}

//class FuShuException extends Exception{  // 编译检查异常
class FuShuException extends RuntimeException{ // 编译不检查异常
    /**
     *  自定义异常
     */
    // 编译器自己加的一句
    private static final long serialVersionUID = 1L;//

    FuShuException() {
    }
    FuShuException(String msg) {
        super(msg);
    }
}

class ExceptionDemo2{
    public static void main(String[] args) throws FuShuException {
        int [] arr = new int[3];
        Demo d = new Demo();

        // int num = d.method(arr, 2);
        // System.out.println("num = " + num + "\n over");

        // int num2 = d.method(null, 2);
        // System.out.println("num = " + num2 + "\n over");

        int num = d.method(arr, -20);
        System.out.println("num = " + num + "\nover");

    }
}