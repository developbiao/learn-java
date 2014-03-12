/**
 * @Date:2014/03/10
 * @Discribe:System.out 的格式化输出
 * @Author:GongBiao
 */
package learn.demo1;

public class SumDemo_02 {
	public static void main(String[] args){
		
		for (int i = 0; i < 100; i++){
			System.out.format("%-4d", i);  //格式化输出
		}
		
		System.out.println("is ok !");
	}
}
