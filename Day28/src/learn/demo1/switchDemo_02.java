/**
 * @Date:2014/03/09
 * @Discribe:java switch��ϰ��ϰ
 * @Author:GongBiao
 */
package learn.demo1;

import java.util.Scanner;

public class switchDemo_02 {
	
	public static void main(String[] args){
		
		//���ÿյ����¶�
		Scanner scan = new Scanner(System.in);
		System.out.println("������յ����¶�:");
		int volue = scan.nextInt();
		
		switch (volue){
		case 20:
			System.out.println("�������ڵ��¶���20��");
			break;
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
			System.out.println("�������ڵ��¶�����");
			break;
		case 30:
			System.out.println("̫���˶����岻��");
			break;
		default:
			System.out.println("�������ܿյ�!");
		}
		
		scan.close();
		
		System.out.println("is ok !");
	}

}
