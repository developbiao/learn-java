/**
 * @Date:2014/03/20
 * @Discribe:反射的Constructor练习
 * @Author:GongBiao
 */
package learn.reflaction;

import java.lang.reflect.Constructor;

public class ReflectStringBufferDemo_03 {
	
	public static void main(String[] args) throws Exception{
		
		//构造器的获取
		Constructor<?> constructor1 = String.class.getConstructor(StringBuffer.class);
		//通过构造器的newInstance()方法参数来造String对象
		String str1 = (String)constructor1.newInstance(new StringBuffer("hello java!"));
		
		System.out.println(str1.charAt(3));
		
		System.out.println("is ok !");
	}

}
