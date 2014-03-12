/**
 * @Date:2014/03/10
 * @Discribe:对象与内存控制练习03
 * @Author:GongBaio
 */
package learn.demo3;

public class StaticSub extends StaticBase {
	
	//子类定义一个count 类变量
	static int count = 200;
	public void info(){
		
		System.out.println("访问本类的count类变量:" + count);
		System.out.println("访问父类的count类变量:" + StaticBase.count);
		System.out.println("访问父类的count类变量 :" + super.count);
	}
	
	public static void main(String[] args){
		
		StaticSub sb = new StaticSub();
		sb.info();
		
		System.out.println("is ok !");
	}

}

class StaticBase{
	//定义一个count类变量
	static int count = 20;
}
