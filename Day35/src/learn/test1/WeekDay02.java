/**
 * @Dscribe:���г��󷽷���ö����ͨ��
 * 
 */
package learn.test1;

public abstract class WeekDay02 {
	
	private WeekDay02(){};  //private ˽�л������������
	
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
	
	public abstract WeekDay02 nextDay();  //������һ�����󷽷�
	
	 @Override
	public String toString(){
		
		return this == MON? "SUN":"MON";
	}

}
