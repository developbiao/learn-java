
/*
 * @Date:2014/03/20
 * @Discribe:�ֶεķ�����ϰ
 * @Author:GongBiao
 */

package learn.reflection2;

import java.lang.reflect.Field;

public class FieldDemo_01 {
	
	/**
	 * 
	 * �޸��ֶξ�����ϰreflection
	 */
	
	public static void main(String[] args) throws Exception{
		
		ReflectPoint pt = new ReflectPoint("Coffee", "CisCo", "Happy");
		
		changeStringValue(pt);
		System.out.println(pt);
		
		System.out.println("is ok !");
	}

	private static void changeStringValue(Object obj) throws Exception{
		// TODO Auto-generated method stub
		//��һ����ֻ���޸�public�� �����޸�private ��  
		Field[] fields = obj.getClass().getDeclaredFields();  //���������getFied �޸�ΪgetDeclaredFields() ��OK�ˣ�
		for (Field field : fields){
			field.setAccessible(true);    //����������
			String oldValue = (String)field.get(obj);
			//System.out.println(oldValue);
			String newValue = oldValue.replace("C", "K");  //replace������ԭ���ֶ�����C�ĸ�ΪK
			field.set(obj, newValue);
		}
		
	}

}
