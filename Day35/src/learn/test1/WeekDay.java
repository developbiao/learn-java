/**
 * @Discribe：一个普通的枚举类
 * 
 */
package learn.test1;

public class WeekDay {
	
	private WeekDay(){};
	
	public final static WeekDay SUN = new WeekDay();  //申明有最终的只有这些对象
	public final static WeekDay MON = new WeekDay();
	//public final static WeekDay TUE = new WeekDay();
	
	public WeekDay nextDay(){   //WeekDay方法判断下一个是哪一天
		if (this == SUN){
			return MON;
		}else{
			return SUN;
		}
	}
	
	@Override //自己的toString 方法
	public String toString(){    
		return this == SUN? "SUN":"MON";
	}
}
