/**
 * @Date:2014/03/12
 * @Discribe:Final变量的初始化练习题
 * @Author:GongBiao
 */
package learn.demo1;

public class FinalInstanceVaribaleTest {
	
	//定义final类变量时赋初值
	final static int var1 = "我很想你".length();
	final static int var2;
	
	//在静态初始化块中为var2赋值初始化值
	static {
		var2 = "我在学习编程的思想".length();
	}
	
	public static void main(String[] args){
		
		System.out.println(FinalInstanceVaribaleTest.var1);
		System.out.println(FinalInstanceVaribaleTest.var2);
		
		System.out.println("is ok !");
	}

}
