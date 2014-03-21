/**
 * @Date:2014/03/19
 * @Dscribe:·´ÉäµÄÑ§Ï°01
 * @Author:GongBiao
 */
package learn.demo1;

public class Demo_Day36Frist {
	
	public static void mian(String[] args){
		
		WeekDay weekDay = WeekDay.SUN;
		weekDay.nextDay();
		
		
		System.out.println("is ok !....");
	}
	

}

class WeekDay{
	
	private WeekDay(){};
	
	public final static WeekDay SUN = new WeekDay();
	public final static WeekDay MON = new WeekDay();
	
	public WeekDay nextDay(){
		
		if (this == SUN){
			return MON;
		}
		else{
			
			return MON;
		}
	}
	
	public String toString(){
		return this == SUN?"MON":"SUN";
	}
}
