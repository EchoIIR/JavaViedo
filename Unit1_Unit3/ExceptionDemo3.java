
//class FuShuException extends Exception{  // 编译检查异常
class FuShuException3 extends RuntimeException { // 编译不检查异常
    /**
     * 自定义异常
     */
    // 编译器自己加的一句
    private static final long serialVersionUID = 1L;//

    FuShuException3() {
    }

    FuShuException3(String msg) {
        super(msg);
    }
}

class Demo3{
    public int method3(int[] arr, int index) throws FuShuException3{
        if (index < 0) {
            throw new FuShuException3("函数中的方法异常信息");
        }
        return arr[index];
    }
}

class ExceptionDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Demo3 d = new Demo3();
        try {
            int num = d.method3(arr, -30);
            System.out.println("num=" + num);            
        } catch (FuShuException3 e) {
            //TODO: handle exception
            System.out.println("e.getMessage():  " + e.getMessage());
            System.out.println("e: " + e);
            System.out.println("负数角标异常");
            e.printStackTrace();
        }
        System.out.println("over");

    }
}
