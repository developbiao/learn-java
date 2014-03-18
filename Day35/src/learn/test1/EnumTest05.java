/**
 * @Date:2014/03/18
 * @Discribe:带有抽象方法的枚举  TrafficLamp
 * @Author:GongBiao
 */
package learn.test1;

public class EnumTest05 {
	
	public static void main(String[] args){
		
		TrafficLamp lamp = TrafficLamp.RED;
		System.out.println(lamp.nextLamp());
		
		System.out.println("is ok !");
	}
	
	//定义一个枚举TrafficLmap
	
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
		
		public abstract TrafficLamp nextLamp();  //抽象方法 nextLamp()
		private int time;
		private TrafficLamp(int time){
			this.time = time;
		}
		
	}

}
