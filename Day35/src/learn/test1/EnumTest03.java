/**
 * @Date:2014/03/18
 * @Discribe:带有构造器的枚举
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest03 {
	
	public static void main(String[] args){
		
		WeekDay04 weekDay04 = WeekDay04.TUE;
		
		System.out.println(weekDay04);
		
		System.out.println("is ok !");
	}
	
	
	public enum WeekDay04{  //枚举对象
		
		SUN, MON, TUE(3), WED, THI, FRI, SAT;  //元素必需在前面
		private WeekDay04(){  //默认构造器
			System.out.println("HaHa-OHoh");
		}
		
		private WeekDay04(int point){
			System.out.println("这周是星期三");
		}
	}
	
}


