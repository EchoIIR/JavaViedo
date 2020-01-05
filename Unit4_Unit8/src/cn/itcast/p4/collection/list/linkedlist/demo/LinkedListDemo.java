
package src.cn.itcast.p4.collection.list.linkedlist.demo;
import java.util.Iterator;
import java.util.LinkedList;


class LinkedListDemo{
	public static void main(String[] args) {

		LinkedList<String> link = new LinkedList<String>();

		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");

		// 迭代器遍历元素
		Iterator<String> it = link.iterator();
		while(it.hasNext()){
			System.out.println("next:" +it.next());
		}

		// // getFirst：获取第一个元素但不删除
		// System.out.println("getFirst:" + link.getFirst());
		// // removeFirst：获取第一个元素且删除
		// System.out.println("removeFirst:" + link.removeFirst());

		// removeFirst遍历元素
		System.out.println("\nBefore removeXXX link:" + link);
		while(!link.isEmpty()){
			// System.out.println("removeFirst:" + link.removeFirst());
			System.out.println("\nremoveLast:" + link.removeLast());
		}
		System.out.println("\nAfter removeXXX link:" + link);

	}
}