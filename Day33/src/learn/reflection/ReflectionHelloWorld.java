/**
 * @Date:2014/03/13
 * @Discribe:Reflection 反射的学习01  
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Method;

public class ReflectionHelloWorld {
	
	//获取赫鲁晓夫的类型名称
	
	public static void main(String[] args){
		
		Foo f = new Foo();
		System.out.println(f.getClass().getName());  //打印出类的名字
		
		System.out.println("is ok !");
	}

}

class Foo{
	public void print(){
		System.out.println("Hello Reflection!");
	}
}

