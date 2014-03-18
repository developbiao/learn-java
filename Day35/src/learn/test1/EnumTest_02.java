/**
 * @Date:2014/03/18
 * @Discribe:enum的枚举的基本应用
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest_02 {
	
	//定义一个枚举
	
	public enum WeekDay03{
		SUN, MON, TUE, WED, THI, FRI, SAT
	}
	
	public static void main(String[] args){
		
		WeekDay03 weekDay03 = WeekDay03.SAT;
		System.out.println(weekDay03);
		System.out.println(weekDay03.ordinal());  //返回位置
		System.out.println(weekDay03.valueOf("WED"));
		System.out.println(weekDay03.values().length);  //返回这个对象的长度
		
		for (WeekDay03 weeks : weekDay03.values()){  //迭代这个weekDay03
			System.out.println(weeks);
		}
		
		
		System.out.println("is ok !");
	}
}
