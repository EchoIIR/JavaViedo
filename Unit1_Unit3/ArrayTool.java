/**
   建立一个用于操作数组工具类，
   其中包括常见的对数组的操作函数
如：获取最大值
@author Echo
@version v1.0
*/  
class ArrayTool{
    // ArrayTool类中方法都是静态，
    // 所以该类不需要创建对象，
    // 为了保证不让其他成创建该类对象，
    // 可以将构造函数私有化 
    private ArrayTool(){}

    /** 
       获取int 数组最大值
       @param arr: 接收一个整形数组
       @return : 该数组中最大值
        */ 
    public static int getMax(int [] arr) {
        int maxIndex = 0;
        for (int x = 0; x<arr.length; x++){
            if (arr[x] > arr[maxIndex]){
                maxIndex = x;
            }
        }
        return arr[maxIndex];
    }

    /** 
       获取int[] arr,某个元素的index
       @param arr: 接收一个整形数组,以及元素
       @return : 该元素的index
        */ 
    public static int getIndex(int [] arr,int target) {
        int index = 0;
        for (int x = 0; x<arr.length; x++){
            if (arr[x] == target){
                index = x;
                return index;
            }
        }
        index = -1;
        return index;
    }


}
