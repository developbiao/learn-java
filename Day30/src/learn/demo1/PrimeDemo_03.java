/**
 * @Date:2014/03/11
 * @Discribe:素数练习03
 * @Author:GongBiao
 */
package learn.demo1;

public class PrimeDemo_03 {
	
	public static void main(String[] args){
		
		int count = 0;
		for (int i = 2; i < 200; i++){
			if (IsPrime(i)){
				System.out.print(i + " ");
				count ++;
				if (count % 10 == 0){
					System.out.println();
				}
			}
		}
		
		System.out.println("is ok !");
	}

	private static boolean IsPrime(int number) {
		//求素数的方法
		
		for (int i = 2; i < number; i++){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}

}
