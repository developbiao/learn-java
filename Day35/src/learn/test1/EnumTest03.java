/**
 * @Date:2014/03/18
 * @Discribe:���й�������ö��
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest03 {
	
	public static void main(String[] args){
		
		WeekDay04 weekDay04 = WeekDay04.TUE;
		
		System.out.println(weekDay04);
		
		System.out.println("is ok !");
	}
	
	
	public enum WeekDay04{  //ö�ٶ���
		
		SUN, MON, TUE(3), WED, THI, FRI, SAT;  //Ԫ�ر�����ǰ��
		private WeekDay04(){  //Ĭ�Ϲ�����
			System.out.println("HaHa-OHoh");
		}
		
		private WeekDay04(int point){
			System.out.println("������������");
		}
	}
	
}


