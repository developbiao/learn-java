/**
 * @Date:2014/03/19
 * @Discribe:ɾ��һ���ļ�
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;


public class DeleteDemo_01 {
	
	public static void main(String[] args){
		
		String fileName = "D:" + File.separator + "hello.log";
		
		File f1 = new File(fileName);
		
		if (f1.exists()){
			f1.delete();
		}else{
			
			System.out.println("�ļ�������!");
		}
		
		System.out.println("����ִ�����!");
	}

}
