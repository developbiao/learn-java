/**
 * @Date:2014/03/20
 * @Discribe:�������ϰ��StringBuffer
 * @Author:GongBiao
 */
package learn.reflaction;

import java.lang.reflect.Constructor;

public class ReflectStringBufferDemo_02 {
	
	public static void main(String[] args) throws Exception{
		
		Constructor constructor1 = String.class.getConstructor(StringBuffer.class);
		String str1 = (String)constructor1.newInstance( new StringBuffer("abcdef"));
		
		System.out.println(str1.charAt(5));   //�������"f"
		
		System.out.println("is ok !");
	}

}
