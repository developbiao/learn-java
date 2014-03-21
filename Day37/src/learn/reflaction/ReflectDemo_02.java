/**
 * @Date:2014/03/20
 * @Discribe:反射练习02
 * @Author:GongBiao
 */
package learn.reflaction;
import java.lang.reflect.Field;
public class ReflectDemo_02 {
	public static void main(String[] args) throws Exception{
		
		ReflectPoint pt1 = new ReflectPoint(3,5);
		//Field fieldY = pt1.getClass().getField("y");  //获取y
		//System.out.println(fieldY.get(pt1));

		
		Field fieldX = pt1.getClass().getDeclaredField("x");  //给我看到
		fieldX.setAccessible(true);  //暴力取
		System.out.println(fieldX.get(pt1));
		
		//获取Reflect里面的属性 Y
		
		Field fieldY = pt1.getClass().getDeclaredField("y");
		fieldY.setAccessible(true);
		System.out.println(fieldY.get(pt1));  //打印fieldX的值
	
		
		System.out.println("is ok!");
	}
}
