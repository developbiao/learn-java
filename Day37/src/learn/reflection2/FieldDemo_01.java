
/*
 * @Date:2014/03/20
 * @Discribe:字段的反射练习
 * @Author:GongBiao
 */

package learn.reflection2;

import java.lang.reflect.Field;

public class FieldDemo_01 {
	
	/**
	 * 
	 * 修改字段经典练习reflection
	 */
	
	public static void main(String[] args) throws Exception{
		
		ReflectPoint pt = new ReflectPoint("Coffee", "CisCo", "Happy");
		
		changeStringValue(pt);
		System.out.println(pt);
		
		System.out.println("is ok !");
	}

	private static void changeStringValue(Object obj) throws Exception{
		// TODO Auto-generated method stub
		//有一问题只能修改public， 不能修改private ？  
		Field[] fields = obj.getClass().getDeclaredFields();  //解决方法把getFied 修改为getDeclaredFields() 就OK了！
		for (Field field : fields){
			field.setAccessible(true);    //问题在这里
			String oldValue = (String)field.get(obj);
			//System.out.println(oldValue);
			String newValue = oldValue.replace("C", "K");  //replace方法把原来字段里面C的改为K
			field.set(obj, newValue);
		}
		
	}

}
