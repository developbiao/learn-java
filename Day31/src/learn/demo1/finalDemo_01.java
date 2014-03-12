/**
 * @Date:2014/03/12
 * @Discribe:FaliyDemo
 * @Author:GongBiao
 */
package learn.demo1;

public class finalDemo_01 extends StaticBase {
	
	//子类再定义一个count变量
	static int count = 200;
	public void info(){

		System.out.println("访问本类的count 类变量:" + count);
		System.out.println("访问父类的count 类变量:" + StaticBase.count);
		System.out.println("访问父类的count 类变量:" + super.count);
	}
	public static void main(String[] args){
	
		finalDemo_01 sb = new finalDemo_01();
		sb.info();
		System.out.println("is ok !");
	}

}

class StaticBase{
	//定义一个count类变量
	static int count = 20;
	
}


