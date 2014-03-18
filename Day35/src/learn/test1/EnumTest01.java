/**
 * @Date:2014/03/18
 * @Discribe:用普通的类实现枚举
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest01 {
	
	public static void main(String[] args){
		
		WeekDay weekDay = WeekDay.MON;   //定义了一个WeekDay类型的对象只能使用里面的指定值
		System.out.println(weekDay.nextDay());
		
		WeekDay02 weekDay02 = WeekDay02.SUN;
		
		System.out.println(weekDay02.nextDay());
		System.out.println("is ok !");
	}

}
