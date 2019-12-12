class OperateDemo 
{
    public static void main (String[] args)
    {
        // 算术运算符： + - * / %
      
        // 字符串拼接
        System.out.println("ab" + 2);

        int a = 4; 
        int b = 5;
        System.out.println(a + "," + b);
        System.out.println("a = " + a + "," +" b = "+ b);

        // 自加
        int c1 = 1;
        int c2; 
        System.out.println("c1="+ c1);
        ++c1;
        System.out.println("c1="+ c1);
        c1++;
        System.out.println("c1="+ c1);
        c2 = c1++;
        System.out.println("c2="+ c2);

        // 2*8的实现
        System.out.println("2*8 = " + 2*8);
        System.out.println("2*8 = " + (2<<3));

        // 两个数互换
        // 
        int a1 = 3;
        int b1 = 5;
        // 法一： 障眼法
        System.out.println("a1 = " + a1 + ",b1 = " + b1);
    /*    // 法二：中间变量（实际开发中使用）
        int z1 ;  
        z1 = a1;
        a1 = b1;
        b1 = z1;
        System.out.println("a1 = " + b1 + ",b1 = " + a1);
    */
        // 法三： 先和再分(可能超出范围)
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("a1 = " + b1 + ",b1 = " + a1);
        // 法四： 位运算(面试中考)
        a1 = a1 ^ b1; 
        b1 = a1 ^ b1; //   b1 = a1 ^ b1 ^ b1 = a1
        a1 = a1 ^ b1; //   a1 = a1 ^ b1 ^ a1 = a1
        System.out.println("a1 = " + b1 + ",b1 = " + a1);

        // 三元运算符
        int x =3,y;
        y = (x>1)?100:200;
        System.out.println("y = " + y); 
        // example1: 获取两个整数中较大的整数
        int max;
        int x1 = 2;
        int x2 = 3;
        max = (x1>x2)?x1:x2;
        System.out.println("max = " + max); 

        // example2: 获取三个整数中最大的数
        int temp;
        int xx1 = 2;
        int xx2 = 3;
        int xx3 = 5;
        temp = (xx1>xx2)?xx1:xx2;
        max = (temp>xx3)?temp:xx3;
        System.out.println("max = " + max); 
    }
}