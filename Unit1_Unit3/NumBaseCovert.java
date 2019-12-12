class NumBaseCovert{
    public static void main(String[] args) {
        int num = 8;
        toBinary(num);
        toOctal(num);
        toHex(num);
    }
    public static void toBinary(int num){
        trans(num,1,1);
    }
    public static void toOctal(int num){
        trans(num,7,3);
    }
    public static void toHex(int num){
        trans(num,15,4);
    }
    public static void trans(int num, int base, int offset){
        // 用查表法算2进制到16进制 + 数组存结果
        /* ========== 难点一：java 中的int有4个byte，32bit ================
            16进制 4bit（0-15）表示一个十进制数 ---> result需要32/4 = 8个元素
            8进制  3bit（0-7）表示一个十进制数 ---> result需要32/3 = 11个元素
            2进制   1it（0-1）表示一个十进制数 ---> result需要32/1 = 32个元素   
           ========== 难点二：base,offset ================================
           base: 各个进制下最大的数：16->F，10->9,8->7,2->1
           offset: 各个进制用几位数表示一个十进制数，则该进制下的offset就是几
        */        
        System.out.println("\n The num " + num + " trasfer using Table is :" ); 
        char[] table = {'0','1','2','3','4','5','6',
                        '7','8','9','A','B','C',
                        'D','E'};

        
        char[] result = new char[32]; // 按占位最大的二进制来分，用32位存结果
        int pos = result.length;
        if (num == 0){
            System.out.println("0");
            return;
        }
        while (num != 0){
            int temp = num & base;        // 取数
            result[--pos] = table[temp]; 
            num = num>>>offset;
        }
       
        //System.out.println("\n result2"); 
        for (int x=0; x<=result.length-1;x++){
            // 倒序打印数组元素
            System.out.print(result[x]);
        }
    }
}