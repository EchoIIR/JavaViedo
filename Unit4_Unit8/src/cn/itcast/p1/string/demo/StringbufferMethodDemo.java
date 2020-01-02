package src.cn.itcast.p1.string.demo;

/*
// StringBuffer是一个容器
        // 1、增：append
        // append方法总是在缓冲区的末尾添加这些字符;
        // insert方法添加字符指定点
// 2、
*/


class StringbufferMethodDemo{
    public static void main(String[] args) {
        bufferMethodDemo();
    }

    public static void bufferMethodDemo() {
        // StringBuffer初始对象的长度为16
        StringBuffer sb = new StringBuffer();
        
        // ============= 1、增：append ============= 
        // append方法总是在缓冲区的末尾添加这些字符;
        // insert方法添加字符指定点。
        StringBuffer s1 = sb.append(4);// s1和sb指的是同一个容器
        System.out.println("sb = " + sb + "\ns1 = " + s1 + "\nsb==s1吗？ " + (sb==s1));//true
        sb.append(true).append("haha").append(23); // 方法调用链：在尾部增加
        System.out.println("sb = " + sb);
        sb.insert(2, "zzz");
        System.out.println("sb = " + sb);
        // ============= 2、删除： ============= 
        sb.delete(0,2);// 删除：0，1
        System.out.println("sb = " + sb);
        // 清空缓存区
        // sb.delete(0,sb.length());
        // System.out.println("sb = " + sb);
        // ============= 3、查找 ============= 
        System.out.println( "sb.charAt(5)"+sb.charAt(5));    //返回在这个序列指定char值指数
        System.out.println( "sb.indexOf(zzz)"+sb.indexOf("zzz"));  

        // ============= 4、修改 ============= 
        sb.replace(1,4, "dscddf"); // 把1，2，3的位置替换为dscddf（替换之后变长）
        System.out.println("sb = " + sb);

        // ============= 4、修改 ============= 
        sb.setLength(5); // 把1，2，3的位置替换为dscddf（替换之后变长）
        System.out.println("sb.length() = " + sb.length()+ "\nsb:" + sb);
    }
}