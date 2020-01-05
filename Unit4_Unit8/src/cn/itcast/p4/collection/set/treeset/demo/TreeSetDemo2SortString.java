package src.cn.itcast.p4.collection.set.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;

import src.cn.itcast.p4.collection.set.treeset.comparator.ComparetorByStringlength;

/* ===== 练习：对字符串按长度排序

*/

class TreeSetDemo2SortString {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet(new ComparetorByStringlength());

        ts.add("aaaa");
        ts.add("zz");
        ts.add("nbdag");
        ts.add("c");
        ts.add("edsdfd");
        ts.add("e");

        // 默认排序：
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}