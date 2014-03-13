/**
 * @Date:2014/03/11
 * @Discribe:输出1-200的素数 Perime Demo1
 * @Author:GongBiao
 */
package learn.demo1;

public class Demo_01 {
	
	public static void main(String[] args){
		
		int j = 0;
		for (int i = 2; i <= 200; i++){
			if (isPrime(i)){
				System.out.print(i + "  ");
				j++;
				if (j % 10 == 0 ){  //每10个换一行
					System.out.println();
				}
			}
		}
		
		System.out.println("is ok !");
	}
	
	public static boolean isPrime(int n){
		for (int i = 2; i < n; i ++){
			if (i % n == 0){
				return false;
			}
		}
		
		return true;
	}

}
