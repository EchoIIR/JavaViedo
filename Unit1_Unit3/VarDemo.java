class VarDemo
{
    public static void main(String[] args)
    {
        int b = 300;
        System.out.println(b);
        
        // 运算两端同类型
        int x = 3;
        x = x + 5;  
        System.out.println(x);

        // 运算两端不同类型，隐式类型转换
        x = x + b; 
        System.out.println(x);
        
        // 运算两端不同类型，强制类型转换
        b = (byte) (x + b) ;  
        System.out.println(b);

        // 字符型和数值型
        System.out.println((char)('a' + 1));     
        
        // 汉字和数值
        System.out.println( '你'+ 1);   // unicode   
                
        // 字符和数值
        System.out.println( '0'+ 0);     

        // 4 是int类（java整数默认都是int），故c是int型
        byte c = 4;   
        byte c1 = 3;
        byte c2 = 7;
        //c = c1 + c2;  // 错误，右边变量无法确定，可能溢出
        c = 3 + 7;      // 正确 ，右边是常量
        int xz;         // 正确，右边不会溢出
        xz = c1+c2; 
        System.out.println(c); 


    }
}