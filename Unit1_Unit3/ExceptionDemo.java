// java 异常与其他语言异常对比

class ExceptionDemo
{
    public static void main(String[] args) {
        //int [] arr = new int[3];
        /*
        System.out.println(arr[3]);
        // Exception in thread "main" 
        // java.lang.ArrayIndexOutOfBoundsException: 
        // Index 3 out of bounds for length 3 
        // at ExceptionDemo.main(ExceptionDemo.java:5)
        */
        sleep1(5);
        
    }

    public static void sleep1(int time){
        // 其他语言的处理方式：处理问题和发现问题在一起
        if(time < 0){
            //问题处理
            //问题处理
            //问题处理
        }
        if(time >10000){
            //问题处理
            //问题处理
            //问题处理
        }
        System.out.println("I am sleep about" + time + "hours");
    }

    public static void sleep2(int time){
        // java的处理异常的方式：通过类与对象
        if(time < 0){
            new FuTime();  // 抛出异常
        }
        if(time >10000){
            new BigTime(); // 抛出异常
        }
        System.out.println("I am sleep about" + time + "hours");
    }
}

class FuTime{}
class BigTime{}