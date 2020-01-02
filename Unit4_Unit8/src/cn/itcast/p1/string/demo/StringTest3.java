package src.cn.itcast.p1.string.demo;
import java.lang.Math;
class StringTest3{
    public static void main(String[] args) {
        String str1 = "qweradcdtvyuiop";
        String str2 = "xcabcdtvybn";

        String[] subStrs = getStringMaxSubstring(str1,str2);
        System.out.println("\nStr1:"+ str1+ "\nstr2:"+str2 +"\n\nstr1和str2中的共有子串为：");
        printSubStrs(subStrs);
    }

    private static void printSubStrs(String[] subStrs) {
        /* ===== 共有子串：subStrs =============
        *  1. 打印已经找到的共有子串：subStrs
        *  2. 并统计个数subStrcount
        */
        int subStrcount = 0;
        // System.out.println("共有子串为：");
        for(int i=0;i<subStrs.length;i++){
            if(subStrs[i] !=null){
                System.out.print("subStr"+ (i+1) + ":"+subStrs[i] + "\t");//输出结果
                subStrcount++;
            }else{
                break;
            }  
        }
        System.out.println("\n共有子串的个数：" + subStrcount);

        /* ===== 最大共有子串：maxSubStrs =============
        *  1. 找到最大共同子串：maxSubStrs
        *  2. 打印并统计个数maxSubStrCount
        *  注意：共有子串subStrs中共同子串随着角标的增加，长度减小。
        */

        if(subStrs!=null){// 有共同子串
            String[] maxSubStrs = new String[subStrcount];
            int maxSubStrCountIndex = 0;
            // 1.找到最大共同子串的集合
            for(int i=0; i<maxSubStrs.length-1; i++){
                if(subStrs[i].length() > subStrs[i+1].length()){//只有1个
                    // subStrs中共同子串随着角标的增加，长度减小。
                    maxSubStrs[maxSubStrCountIndex] = subStrs[i];
                    break;
                }else if(subStrs[i].length() == subStrs[i+1].length()){
                    maxSubStrs[maxSubStrCountIndex] = subStrs[i];
                    maxSubStrs[maxSubStrCountIndex+1] = subStrs[i+1];
                }
            } 
            // 2.打印最大子串，并统计个数maxSubStrCount
            int maxSubStrCount = 0;
            System.out.println("\n其中最大子串为：");
            for(int i=0;i<maxSubStrs.length;i++){
                if(maxSubStrs[i]!=null){
                    System.out.print("maxSubStr"+ (i+1) + ":"+maxSubStrs[i] + "\t");//输出结果
                    maxSubStrCount++;
                }else{
                    break;
                }  
            } 
            System.out.println("\n最大子串的个数：" + maxSubStrCount + "\n");
        }
    }

    public static String[] getStringMaxSubstring(String str1, String str2) {
        // 字符串数组的初始化
        // subStrs：用于放str1，str2的共有子串,其最大值应该为：1+2+3+...+(Math.min(str1.length(), str2.length()))
        int minLength =  Math.min(str1.length(), str2.length());
        String []subStrs = new String[(1+minLength)*minLength/2]; 

        // 找到短的str，按要求传入getMinLenSubstr
        // 这里可以根据？：：表达式改写
        if ( str1.length() > str2.length()){// str1比str2长
            subStrs =  getMinLenSubstr(str1,str2);
        }else{ // str2比str1长
            subStrs =  getMinLenSubstr(str2,str1);
        }

        return subStrs;
    }

    public static String[] getMinLenSubstr(String maxStr,String minStr) {
        // System.out.println("maxStr:" + maxStr);
        // System.out.println("minStr:" + minStr);

        String[] subStrs =new String[(1 + minStr.length())*minStr.length()/2];//用于存两个字符串的共同子串
        String subStr;
        int subStrcountIndex = 0;
        for(int i = minStr.length(); i > 0; i--){// i表示子串的长度i,从最大的往最小的长度找
            System.out.println("minStr:" + minStr + "中的长度为" + i + "的子串为");
            for(int begin = 0, end = i; end<= minStr.length();begin++,end++){
                subStr = minStr.substring(begin, end);
                System.out.println(subStr);
                if(maxStr.indexOf(subStr)!=-1){// 短的字符串的子串在长的字符串中
                    subStrs[subStrcountIndex] = subStr;
                    System.out.println("!!!刚找到的:"+ subStr +"\n是" + "maxStr:"+ maxStr+ "和"+ "minStr:"+minStr +"的共有子串，记作：\nsubStr" + (subStrcountIndex+1) + " = " + subStrs[subStrcountIndex]);
                    subStrcountIndex++;
                }
            }
        }
        System.out.println("共有子串找完了！");
        return subStrs;
    }
}