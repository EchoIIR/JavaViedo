package src.cn.itcast.p4.vector.demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


// vector:内部是数组数据结构，是同步的，增删、查询都很慢。
class VectorDemo{
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()){
			System.out.println("nextElement:" + en.nextElement());
		}

		Iterator<String> it = v.iterator();
		while(it.hasNext()){
			System.out.println("next:" +it.next());
		}
		
	}
}