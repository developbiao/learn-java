/**
 * @Date:2014/03/13
 * @Discribe:并创建对象
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Method;

public class ReflectionDemo_03 {
	
	public static void main(String[] args){
		
		//创建Class实例
		Class<?> c = null;
		try{
			c = Class.forName("learn.reflection.App");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		//创建App实例
		App a = null;
		try{
			
			a = (App) c.newInstance();  //c.newInstance 判断包括的意思
			
			a.Display();   //调用方法
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("is ok ");
	}

}

class App{
	
	public void Display() {
		System.out.println("Show Time!");
	}
}
