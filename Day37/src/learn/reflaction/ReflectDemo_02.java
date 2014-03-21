/**
 * @Date:2014/03/20
 * @Discribe:������ϰ02
 * @Author:GongBiao
 */
package learn.reflaction;
import java.lang.reflect.Field;
public class ReflectDemo_02 {
	public static void main(String[] args) throws Exception{
		
		ReflectPoint pt1 = new ReflectPoint(3,5);
		//Field fieldY = pt1.getClass().getField("y");  //��ȡy
		//System.out.println(fieldY.get(pt1));

		
		Field fieldX = pt1.getClass().getDeclaredField("x");  //���ҿ���
		fieldX.setAccessible(true);  //����ȡ
		System.out.println(fieldX.get(pt1));
		
		//��ȡReflect��������� Y
		
		Field fieldY = pt1.getClass().getDeclaredField("y");
		fieldY.setAccessible(true);
		System.out.println(fieldY.get(pt1));  //��ӡfieldX��ֵ
	
		
		System.out.println("is ok!");
	}
}
