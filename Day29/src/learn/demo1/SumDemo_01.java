/**
 * @Date:2014/03/10
 * @Discribe: ��ӵ�1000�ĵ�һ����
 * @Author:GongBiao
 */
package learn.demo1;

public class SumDemo_01 {
	
	public static void main(String[] args){
		
		int sum = 0;
		for (int i=0; i <= 10001 ; i += sum){
			sum += i;
			if (i <= 1000){
				System.out.println(i);
				break;
			}
			
		}
		System.out.println("is ok !");
	}

}
