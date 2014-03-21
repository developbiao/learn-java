/**
 * @Date:2014/03/20
 * @Discribe:�����Constructor��ϰ
 * @Author:GongBiao
 */
package learn.reflaction;

import java.lang.reflect.Constructor;

public class ReflectStringBufferDemo_03 {
	
	public static void main(String[] args) throws Exception{
		
		//�������Ļ�ȡ
		Constructor<?> constructor1 = String.class.getConstructor(StringBuffer.class);
		//ͨ����������newInstance()������������String����
		String str1 = (String)constructor1.newInstance(new StringBuffer("hello java!"));
		
		System.out.println(str1.charAt(3));
		
		System.out.println("is ok !");
	}

}
