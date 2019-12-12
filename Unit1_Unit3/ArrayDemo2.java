class ArrayDemo2
{
    public static void main(String[] args) 
    {
        // 格式2 ： 知道具体元素
        int[] arr ={89,34,270,17}; 
        int max2 = getMax_2(arr);
        System.out.println("max2 = " + max2);
    } 
    public static int getMax_2(int[] arr)
    {
        int maxIndex = 0;
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] > arr[maxIndex] )
            {
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }

}