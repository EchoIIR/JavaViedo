package src.cn.itcast.p1.string.demo;
/*
 ======== indexOf : 父串中没有子串，indexOf返回-1，否则返回第一次子串出现的位置
        String test = "dca";
        int index =   .indexOf(test);
        System.out.println("index = " + index);   // -1
        String test2 = "aer";
        int index2 = str.indexOf(test2);
        System.out.println("index2 = " + index2);  // 2
*/
class StringTest2{
    public static void main(String[] args) {
        String str = "nbaernbatynba"; // 父串
        String key = "nba"; // 要找的子串

        // ========= 方法一：int index = str.indexOf(key); 
        // 每次默认从0开始找
        int count = getKeyStringCount_1(str,key);
        System.out.println("count = " + count); // 直接快速修复，会生成他的定义
        
        //========= 方法二：int index = str.indexOf(key, fromIndex);
        // 每次默认从index开始找
        int count2 = getKeyStringCount_2(str, key);
        System.out.println("count2 = " + count2); 
    }
    
    private static int getKeyStringCount_2(String str, String key) {
        
        System.out.println("===== Begin getKeyStringCount_2:\n" +"key " + key); 
        System.out.println("str " + str); 
        int count = 0;
        int index = str.indexOf(key, 0);
        while(index != -1){
            System.out.println("....current str = " + str);           
            System.out.println("....current index = " + index);
            
            str = str.substring(index + key.length());// new str,必须先更新str
            index =  str.indexOf(key, index); // new index，再计算得到的index才是 new index

            count++;
        }
        return count;
    }

    /** 获取子串在父（整）串中出现的次数
     * 
     * @param str
     * @param key
     * @return
     */
    public static int getKeyStringCount_1(String str, String key) {
        
        System.out.println("===== Begin getKeyStringCount_1:\n" +"key " + key); 
        System.out.println("str " + str); 
        // 1、定义计数器
        int count = 0; 
        // 2、定义变量记录key出现的位置
        int index = str.indexOf(key); 
        while(index != -1){// 父串中是有子串的 
            System.out.println("....current str = " + str);           
            System.out.println("....current index = " + index);

            str = str.substring(index + key.length());// new str
            index = str.indexOf(key);   // new index

            count++;
        }
        // 3、返回子串数目
        return count;
    }

}