class ArrayDemo
{
    public static void main(String[] args) 
    {
        // 格式1 ： 不知道具体元素
        //int[] arr1 = new int[3]; 

        // 格式2 ： 知道具体元素
        int[] arr2 ={89,34,270,17}; 

        // 数组的应用1：求最值
        int max1 = getMax1(arr2);
        int max2 = getMax_2(arr2);
        System.out.println("max1 = " + max1);
        System.out.println("max2 = " + max2);
    }

    public static int getMax1(int[] arr)
    {
        // 元素比较
        int maxElement = arr[0];
        for (int x=1; x<arr.length; x++)
        {
            if (arr[x]>maxElement)
            {
                maxElement = arr[x];
            }
        }
        return maxElement;
    }
    public static int getMax_2(int[] arr)
    {
        // 数组角标比较
        int maxIndex = 0;
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] > arr[maxIndex] )
            {
                maxIndex = i;
            }
        }
        return arr[maxIndex];  // java数组角标的引用是：[]
    }
    /*
    public static void toHex(int num)
    { // 获取一个整数的16进制表现形式

    }
*/
}