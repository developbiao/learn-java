/**
 * @Date:2014/03/20
 * @Discribe:������ϰField
 * @Author:GongBiao
 */
package learn.reflaction;

import java.lang.reflect.Field;


public class FieldDemo_01 {
	
	public static void main(String[] args) throws Exception{
		
		ReflectPoint2  pt2 = new ReflectPoint2(3, 5, 7);
		
		Field fieldX = pt2.getClass().getField("x");  //����public�Ŀ��Ի�ȡ
		System.out.println(" x: " + fieldX.get(pt2));
		
		Field fieldY = pt2.getClass().getField("y");
		System.out.println(" y: " + fieldY.get(pt2));
		
		//����private�ķ�����ȡ�ֶεķ���
		Field fieldV = pt2.getClass().getDeclaredField("var");
		fieldV.setAccessible(true);
		System.out.println( "Var:" + fieldV.get(pt2));
		
		System.out.println("is ok !");
	}

}
