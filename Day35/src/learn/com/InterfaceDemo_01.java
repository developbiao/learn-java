/**
 * @Date:2014/03/18
 * @Discribe:Interface练习
 * @Author:GongBiao
 */
package learn.com;

public class InterfaceDemo_01 {
	
	public static void main(String[] args){
		
		Mac lisa = new AppleLisa(873, 377);
		
		lisa.Display();
		lisa.Method();
		if (lisa.Run(1) == 1){
			System.out.println("机器运行中！");
		}
		
		
		System.out.println("is ok !");
	}

}

class AppleLisa implements Mac {
	
	private int prodes;
	private int id;
	
	public AppleLisa (int id, int prodes){
		this.id = id;
		this.prodes = prodes;
	}
	
	
	public void Display(){
		System.out.println("1984 Apple Lisa!");
	}
	
	public int Run (int open){
		if (open > 0){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public void Method(){
		
		System.out.println(prodes  + ":" + id  + "id");
		
	}
}
