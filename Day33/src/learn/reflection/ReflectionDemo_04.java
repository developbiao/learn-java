/**
 * @Date:2014/03/13
 * @Discribe:��ȡ���캯��������������
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Constructor;

public class ReflectionDemo_04 {
	
	public static void main(String[] args){
		
		//����Classʵ��
		Class<?> c = null;
		try{
			c = Class.forName("learn.reflection.Cat");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		//����Catʵ��
		
		Cat c1 = null;
		Cat c2 = null;
		
		//��ȡ���캯��
		
		Constructor<?> cons[] = c.getConstructors();
		
		try{
			
			c1 = (Cat) cons[0].newInstance();   //��Bug�������⣬û�н��
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
