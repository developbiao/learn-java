/**
 * @Date:2014/03/18
 * @Discribe:enum��ö�ٵĻ���Ӧ��
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest_02 {
	
	//����һ��ö��
	
	public enum WeekDay03{
		SUN, MON, TUE, WED, THI, FRI, SAT
	}
	
	public static void main(String[] args){
		
		WeekDay03 weekDay03 = WeekDay03.SAT;
		System.out.println(weekDay03);
		System.out.println(weekDay03.ordinal());  //����λ��
		System.out.println(weekDay03.valueOf("WED"));
		System.out.println(weekDay03.values().length);  //�����������ĳ���
		
		for (WeekDay03 weeks : weekDay03.values()){  //�������weekDay03
			System.out.println(weeks);
		}
		
		
		System.out.println("is ok !");
	}
}
