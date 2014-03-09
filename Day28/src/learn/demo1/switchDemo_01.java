/*
 * @Date:2014/03/09
 * @Discribe:switch 的复习
 * @Authro:GongBiao
 */
package learn.demo1;

import java.util.Scanner;

public class switchDemo_01 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你要到的楼层: ");
		int count = scan.nextInt();
		
		switch (count){
		case 1:
			System.out.println("一楼到了"); break;
		case 2:
			System.out.println("二楼到了"); break;
		case 3:
			System.out.println("三楼到了"); break;
		case 4:
			System.out.println("四楼到了"); break;
		case 5:
		case 6:
		case 7:
			System.out.println("7楼到了"); break;
		default:
			System.out.println("没有这个楼层");
		
		}
		
		System.out.println("is ok !");
	}

}
