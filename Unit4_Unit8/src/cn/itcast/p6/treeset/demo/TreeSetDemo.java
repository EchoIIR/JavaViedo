package src.cn.itcast.p6.treeset.demo;

import java.util.Iterator;
import java.util.TreeSet;

class TreeSetDemo{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add("abc");
        ts.add("aa");
        ts.add("nba");
        ts.add("cba");

        Iterator it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}