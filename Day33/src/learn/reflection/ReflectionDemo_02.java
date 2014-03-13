/**
 * @Date:2014/03/13
 * @Discribe:调用未知对象的方法
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Method;

public class ReflectionDemo_02 {
	
	public static void main(String[] args){
		
		Foo2 f = new Foo2();
		Method  method;
		try{
			method = f.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(f);

			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("is ok !");
	}

}

class Foo2{
	
	public void print(){
		System.out.println("abc");
	}
}
