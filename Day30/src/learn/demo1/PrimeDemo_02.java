/**
 * @Date:2014/03/11
 * @Discribe:求1-200的素数练习题02  有Bug
 * @Author:GongBiao
 */
package learn.demo1;

public class PrimeDemo_02 {
	
	static int count = 0;
	public static void main(String[] args){
//		
//		for (int i = 2; i <= 200; i++){
//			iSPrime(i);
//		}
		iSPrime(200);
		//System.out.println("\n" + count);
		
		
		System.out.println("is ok !");
	}
	private static void iSPrime(int n) {
		// TODO Auto-generated method stub
		
		int flag = 0;
		for (int i = 2; i <= n; i++){
			
			if (n % i == 0){
				flag = 1;   //flag=1 说明不是素数
			}
			if (flag == 0 ){
				System.out.print(n + " ");
				count ++;
				if (count % 10 == 0 ){
					
					System.out.println();
				}
			}
		}
		
	}

}
