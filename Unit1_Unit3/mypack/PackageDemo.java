package mypack; 
import packa.DemoA; // 导入packa中的DemoA类，用那个导那个

//包mypack是文件夹，里面放PackageDemo.java文件
class PackageDemo{
	public static void main(String[] args) {
		// packa.DemoA d = new packa.DemoA(); // 不impoort就要用全名
		DemoA d = new DemoA();
		d.show();

		packb.DemoB b = new packb.DemoB();
		//b.method();	//method为protected型，故不能直接访问

		System.out.println("Hello Package!");
	}
}