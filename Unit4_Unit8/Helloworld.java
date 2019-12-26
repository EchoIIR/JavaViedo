class Helloworld{
    public static void main(String[] args) {

        // String str = "nbaernbatynba"; //v 父串
        // // // indexOf : 父串中没有子串，indexOf返回-1，否则返回第一次子串出现的位置
        // // String test = "dca";
        // // int index = str.indexOf(test);
        // // System.out.println("index = " + index);   // -1
        // // String test2 = "aer";
        // // int index2 = str.indexOf(test2);
        // // System.out.println("index2 = " + index2);  // 2
        

        // String key = "nba"; // 要找的子串
        // int index = str.indexOf(key,0);       
        // int count = 0;
        // System.out.println("key " + key); 
        // while(index != -1){// 父串中是有子串的 
        //     System.out.println("....current str = " + str);           
        //     System.out.println("....current index = " + index);
            
        //     str = str.substring(index + key.length());// new str
        //     index = str.indexOf(key,index);   // new index
         

        //     count++;
        // }
        // System.out.println("count = " + count);
        String str1 = "qweradcdtyuiop";
        String str2 = "xcabcdvbn";

        String[] result =new String[str2.length()];
        String subStr;
        int count = 0;
        for(int i = str2.length(); i > 0; i--){// i表示子串的长度i,从最大的往最小的长度找
            // System.out.println("minStr:" + minStr + "中的长度为" + i + "的子串为");
            for(int begin = 0, end = i; end<= str2.length();begin++,end++){
                subStr = str2.substring(begin, end);
                // System.out.println(subStr);
                if(str1.indexOf(subStr)!=-1){
                    result[count] = subStr;
                    System.out.println("找到" + "maxStr:"+ str1+ "和"+ "minStr:"+str2 +"中的一个最大子串：\nmaxStr = " + result[count]);
                    count++;
                }
            }
        }
        
    }
}