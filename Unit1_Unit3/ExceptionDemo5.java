// 异常的应用

/* 毕老师用电脑上课
	对象： 毕老师
			电脑
	问题：
		电脑蓝屏：可以处理
		电脑冒烟：不可以处理
	异常转换:MaoYanException到NoPlanException
		MaoYanException: computer is 冒烟.
		大家练习.
		NoPlanException: 课时进度无法完成
		换人!	

	异常转换(封装):
	class NoAddException extends Exception{}

	void addData(Data d) throws NoAddException{
		//连接数据库
		try{
			//添加数据,出现异常:SQLException
		}
		catch(SQLException e){
			//处理代码
			throw new NoAddException(); //异常转换
		}
		finally{
			//关闭数据库
		}
	}
*/
class Comouter{
	private int state = 2; //正常

	public void run() throws LanPingException,MaoYanException{
		// 内部没有处理，要throws一下。
		if (state == 1){// 蓝屏
			throw new LanPingException("computer is 蓝屏.");
		}
		if (state == 2){// 冒烟
			throw new MaoYanException("computer is 冒烟.");
		}
		System.out.println("computer is running.");
	}

	public void reset(){
		this.state = 0;
		System.out.println("电脑重启，state = 0.");
	}
}

class Teacher{
	private String name;
	private Comouter comp;

	Teacher(String name){
		this.name = name;
		comp = new Comouter();
	}

	// public void preLect() throws MaoYanException{//被抛出的异常
	public void preLect() throws NoPlanException{//异常转化
		try {
			comp.run(); // 可能会出现以下2钟异常
			System.out.println( this.name + "在讲课.");			
		} catch (LanPingException e) {
			//这个异常自己可以内部处理的
			comp.reset();
			this.preLect();
		} catch (MaoYanException e) {
			//这个异常自己不能内部处理，要抛出
			System.out.println(e.toString());		
			test(); //大家练习
			//throw e; //这个和公司没关系，无法处理
			throw new NoPlanException("课时进度无法完成." + e.getMessage());
		}
	}

	public void test(){
		System.out.println("大家练习.");		
	}
}

// 异常：
class LanPingException extends Exception{
	LanPingException(String msg){
		super(msg);
	}
} 

class 	MaoYanException extends Exception{
	MaoYanException(String msg){
		super(msg);
	}
} 

class 	NoPlanException extends Exception{
	NoPlanException(String msg){
		super(msg);
	}
} 

class ExceptionDemo5{
	public static void main(String[] args) {
		Teacher t = new Teacher("Bi");
		try {
			t.preLect();
		}//catch(MaoYanException e){
		catch(NoPlanException e){// 异常转换
			System.out.println(e.toString() + "....");
			System.out.println("换人!");
		}
	}
}