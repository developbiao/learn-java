/*
 * @Date:2014/03/09
 * @Discribe:switch �ĸ�ϰ
 * @Authro:GongBiao
 */
package learn.demo1;

import java.util.Scanner;

public class switchDemo_01 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ����¥��: ");
		int count = scan.nextInt();
		
		switch (count){
		case 1:
			System.out.println("һ¥����"); break;
		case 2:
			System.out.println("��¥����"); break;
		case 3:
			System.out.println("��¥����"); break;
		case 4:
			System.out.println("��¥����"); break;
		case 5:
		case 6:
		case 7:
			System.out.println("7¥����"); break;
		default:
			System.out.println("û�����¥��");
		
		}
		
		System.out.println("is ok !");
	}

}
