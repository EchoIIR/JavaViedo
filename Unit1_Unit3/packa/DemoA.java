package packa;
public class DemoA extends packb.DemoB{
	// public static void main(String[] args) {
	// 	show();
	// }
	public static void show(){
		//method为protected型，故不能直接访问
		//但可以通过其子类访问。
		method(); 
		System.out.println("DemoA show run.");
	}
}