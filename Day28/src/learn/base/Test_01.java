/**
 * @Date:2014/03/09
 * @Discribe:访问子类对象的实例变量
 * @Author:GongBiao
 */
package learn.base;

public class Test_01 {
	
	public static void main(String[] args){
		new Derived();
		//new Base();
		System.out.println("is ok!");
	}

}

class Base{
	
	//定义一个名为i的实例变量
	private int i = 2;
	public Base(){
		//直接输出this.i
		System.out.println(this.i);  //虽然是Derived的对象但是编译类型是base
		this.Display();  //this代表正在初始化的对象  正在初始化的对象是Derived
		//输出this.实际的类型,将看到Derived
		System.out.println(this.getClass());
	}
	public void Display(){
		System.out.println(i);
	}
	
	
}

//继承Base的Derived子类

class Derived extends Base{
	
	//定义一个名为i的实例变量 
	private int i = 22;
	
	public Derived(){
		//隐试的调用了base
		i = 222;
	}
	
	public void Display(){
		System.out.println(i);
	}
}
