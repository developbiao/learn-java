/**
 * @Dscribe:带有抽象方法的枚举普通类
 * 
 */
package learn.test1;

public abstract class WeekDay02 {
	
	private WeekDay02(){};  //private 私有化不允许造对象
	
	public final static WeekDay02 SUN = new WeekDay02(){
		
		@Override
		public WeekDay02 nextDay(){
			return MON;
		}
	};
	
	public final static WeekDay02 MON = new WeekDay02(){
		
		@Override
		public WeekDay02 nextDay(){
			return SUN;
		}
	};
	
	public abstract WeekDay02 nextDay();  //定义了一个抽象方法
	
	 @Override
	public String toString(){
		
		return this == MON? "SUN":"MON";
	}

}
