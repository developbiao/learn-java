/**
 * @Date:2014/03/13
 * @Discribe:����������
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Method;

public class ReflectionDemo_03 {
	
	public static void main(String[] args){
		
		//����Classʵ��
		Class<?> c = null;
		try{
			c = Class.forName("learn.reflection.App");
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		//����Appʵ��
		App a = null;
		try{
			
			a = (App) c.newInstance();  //c.newInstance �жϰ�������˼
			
			a.Display();   //���÷���
			
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
