/**
 * @Discribe��һ����ͨ��ö����
 * 
 */
package learn.test1;

public class WeekDay {
	
	private WeekDay(){};
	
	public final static WeekDay SUN = new WeekDay();  //���������յ�ֻ����Щ����
	public final static WeekDay MON = new WeekDay();
	//public final static WeekDay TUE = new WeekDay();
	
	public WeekDay nextDay(){   //WeekDay�����ж���һ������һ��
		if (this == SUN){
			return MON;
		}else{
			return SUN;
		}
	}
	
	@Override //�Լ���toString ����
	public String toString(){    
		return this == SUN? "SUN":"MON";
	}
}
