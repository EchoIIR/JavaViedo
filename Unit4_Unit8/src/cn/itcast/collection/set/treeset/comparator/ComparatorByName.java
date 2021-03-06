package src.cn.itcast.collection.set.treeset.comparator;


import java.util.Comparator;

import src.cn.itcast.p3.bean.Person2;

/* ====== 实现比较器：ComparatorByName
*/ 
public class ComparatorByName implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		// 实现对Person2及其子类按名称排序
		Person2 p1 = (Person2) o1;
		Person2 p2 = (Person2) o2;

		int temp = p1.getName().compareTo(p2.getName());
		
		return temp==0?p1.getAge()-p2.getAge():temp;
	}
}