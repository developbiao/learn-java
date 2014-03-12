/**
 * @Date:2014/03/10
 * @Discribe:Fibonacci
 * @Author:GongBiao
 */
package learn.demo1;

public class Fibonacci {
	
	public static void main(String[] args){
		
		int n0 = 1;
		int n1 = 1;
		int n2;
		
		System.out.print(n0 +" " + n1  + " ");
		
		for (int i = 0; i < 10; i++){
			
			n2 = n1 + n0;
			System.out.println(n2 + "");
			n0 = n1;
			n1 = n2;
		}
		
		
		System.out.println("is ok 1");
	}

}
