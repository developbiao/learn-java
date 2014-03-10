/**
 * @Date:2014/03/10
 * @Discribe:Fibonacci Demo_02
 * @Author:GongBiao
 */
package learn.demo1;

public class Fibonacci_02 {
	
	public static void main(String[] args){
		
		int f1 = 1, f2 = 1;
		System.out.print(f1+ " ");
		for(int i = 3; i <=20; i++){
			
			System.out.format("%-6d", f2);
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
		
		System.out.println("is ok !");
	}

}
