
package src.cn.itcast.p4.collection.list.linkedlist.test;
import java.util.LinkedList;

/* ====== 用LinkedList实现堆栈，队列 ======
堆栈(FILO)：先进后出,First In Last Out : addFirst(),removeLast()
队列(FIFO)：先进先出,First In First Out: addFirst(),removeFirst()
    为了实现描述数据结构，并定义他们的方法，采用类封装，
内部使用LinkedList实现。
*/

class MyDuiLie {
	// LinkedList是Java的链表
	private LinkedList<Object> link; 

	// 构造函数
	public MyDuiLie(){
		this.link = new LinkedList<Object>();
	}
	// add方法
	public void myAdd(Object obj){
		link.addLast(obj);
	}
	// get方法
	public Object myGet(){
		Object obj;
		// obj = link.getFirst();
		obj = link.removeFirst();
		return  obj;
	}
	// isNull用isEmpty实现
	public boolean isNull(){
		return link.isEmpty();
	}
}

class MyStack {
	// LinkedList是Java的链表
	private LinkedList<Object> link; 

	// 构造函数
	public MyStack(){
		this.link = new LinkedList<Object>();
	}
	// add方法
	public void myAdd(Object obj){
		link.addLast(obj);
	}
	// get方法
	public Object myGet(){
		Object obj;
		// obj = link.getFirst();
		obj = link.removeLast();
		return  obj;
	}
	// isNull用isEmpty实现
	public boolean isNull(){
		return link.isEmpty();
	}
}

class LinkedTest {
	public static void main(String[] args) {
		System.out.println("My DuiLie output:");
		MyDuiLie d1 = new MyDuiLie();
		d1.myAdd("abc1");
		d1.myAdd("abc2");
		d1.myAdd("abc3");
		d1.myAdd("abc4");
		while(!d1.isNull()){
			System.out.println(d1.myGet());
		}

		System.out.println("My Stack output:");
		MyStack s1 = new MyStack();
		s1.myAdd("abc1");
		s1.myAdd("abc2");
		s1.myAdd("abc3");
		s1.myAdd("abc4");

		while(!s1.isNull()){
			System.out.println(s1.myGet());
		}
	}
}