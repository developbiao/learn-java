/**
 * @Date:2014/03/18
 * @Discribe:���г��󷽷���ö��  TrafficLamp
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest05 {
	
	public static void main(String[] args){
		
		TrafficLamp lamp = TrafficLamp.RED;
		System.out.println(lamp.nextLamp());
		
		System.out.println("is ok !");
	}
	
	//����һ��ö��TrafficLmap
	
	public enum TrafficLamp{
		RED(30){
			@Override
			public TrafficLamp nextLamp(){
				//System.out.println(30);
				return GREEN;
			}
		}, 
		GREEN(45){
			@Override
			public TrafficLamp nextLamp(){
				return YELLOW;
			}
			
		},
		YELLOW(10){
			@Override
			public TrafficLamp nextLamp(){
				return RED;
			}
		};
		
		public abstract TrafficLamp nextLamp();  //���󷽷� nextLamp()
		private int time;
		private TrafficLamp(int time){
			this.time = time;
		}
		
	}

}
