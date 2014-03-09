/**
 * @Date:2014/03/09
 * @Discribe:java switch复习练习
 * @Author:GongBiao
 */
package learn.demo1;

import java.util.Scanner;

public class switchDemo_02 {
	
	public static void main(String[] args){
		
		//设置空调的温度
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入空调的温度:");
		int volue = scan.nextInt();
		
		switch (volue){
		case 20:
			System.out.println("现在室内的温度是20度");
			break;
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
			System.out.println("现在室内的温度正好");
			break;
		case 30:
			System.out.println("太热了对身体不好");
			break;
		default:
			System.out.println("这是智能空调!");
		}
		
		scan.close();
		
		System.out.println("is ok !");
	}

}
