/**
 * @Date:2014/03/18
 * @Discribe:����ͨ����ʵ��ö��
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest01 {
	
	public static void main(String[] args){
		
		WeekDay weekDay = WeekDay.MON;   //������һ��WeekDay���͵Ķ���ֻ��ʹ�������ָ��ֵ
		System.out.println(weekDay.nextDay());
		
		WeekDay02 weekDay02 = WeekDay02.SUN;
		
		System.out.println(weekDay02.nextDay());
		System.out.println("is ok !");
	}

}
