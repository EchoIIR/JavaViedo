class ArrayToolDemo {
    public static void main(String[] args) {
        int [] arr = { 3, 5, 23, 9, 10 };
        int max = ArrayTool.getMax(arr);
        System.out.println(max);

        int index = ArrayTool.getIndex(arr,3);
        System.out.println(index);

    }




}