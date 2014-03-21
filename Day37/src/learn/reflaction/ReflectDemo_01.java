/**
 * @Date:2014/03/20
 * @Discribe:反射练习01
 * @Author:GongBiao
 */
package learn.reflaction;

import java.lang.reflect.Constructor;

public class ReflectDemo_01 {
	
	public static void main(String[] args) throws Exception{
		
		String str1 = "abc";
		/**
		 * 三种不同的方法获取自解码文件
		 * getClass()
		 * String.Class()  类型
		 * Class.forName("包名");
		 */
		Class cls1 = str1.getClass();
		Class cls2 = String.class;
		Class cls3 = Class.forName("java.lang.String");
		System.out.println(cls1 == cls2);    //true
		System.out.println(cls1 == cls3);   //true
		
		System.out.println(cls1.isPrimitive());  //Primitive 原生类型false
		System.out.println(int.class.isPrimitive());  //true;
		System.out.println(boolean.class.isPrimitive());  //  true
		System.out.println(int[].class.isPrimitive());  //false
		
		//String Buffer
		
		//获取构造函数
		Constructor constrcut1 = String.class.getConstructor(StringBuffer.class);
		String str2 = (String)constrcut1.newInstance(new StringBuffer("abc"));
		System.out.println(str2.charAt(2));   //out put is 'c'
		
		System.out.println("is ok !");
	}

}
