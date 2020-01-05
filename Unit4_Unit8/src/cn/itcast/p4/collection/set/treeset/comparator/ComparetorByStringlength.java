package src.cn.itcast.p4.collection.set.treeset.comparator;

import java.util.Comparator;


/* ====== 实现比较器：ComparatorByName
*/ 
public class ComparetorByStringlength implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String str1 = (String) o1;
		String str2 = (String) o2;

		// int temp =str1.length() - str2.length(); // 短的在前，长的在后
        int temp =str2.length() - str1.length();    // 短的在后，长的在前
        
		return temp==0?str1.compareTo(str2):temp;   //长度相等时再比较内容

    }
    
}