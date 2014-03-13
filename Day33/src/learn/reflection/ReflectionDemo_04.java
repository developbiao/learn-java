/**
 * @Date:2014/03/13
 * @Discribe:获取构造函数，并创建对象
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Constructor;

public class ReflectionDemo_04 {
	
	public static void main(String[] args){
		
		//创建Class实例
		Class<?> c = null;
		try{
			c = Class.forName("learn.reflection.Cat");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		//创建Cat实例
		
		Cat c1 = null;
		Cat c2 = null;
		
		//获取构造函数
		
		Constructor<?> cons[] = c.getConstructors();
		
		try{
			
			c1 = (Cat) cons[0].newInstance();   //有Bug存在问题，没有解决
			c2 = (Cat) cons[1].newInstance("Tom");
			
			c1.Say();
			c2.Say();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	
		
		System.out.println("is ok !");
		
	}

}

class Cat{
	
	String s;
	public Cat(String s){
		this.s = s;
	}
	
	public void Say(){
		System.out.println(s);
	}
}
