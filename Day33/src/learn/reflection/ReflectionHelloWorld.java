/**
 * @Date:2014/03/13
 * @Discribe:Reflection �����ѧϰ01  
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Method;

public class ReflectionHelloWorld {
	
	//��ȡ��³�������������
	
	public static void main(String[] args){
		
		Foo f = new Foo();
		System.out.println(f.getClass().getName());  //��ӡ���������
		
		System.out.println("is ok !");
	}

}

class Foo{
	public void print(){
		System.out.println("Hello Reflection!");
	}
}

