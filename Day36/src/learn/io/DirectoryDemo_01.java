/**
 * @Date:2014/03/20
 * @Discribe:�ж�һ��·���Ƿ�ΪĿ¼
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;

public class DirectoryDemo_01 {
	
	public static void main(String[] args){
		/**
		 * ʹ��isDirectory�ж�һ��ָ����·���Ƿ�ΪĿ¼ 
		 */
		String fileName = "F:" + File.separator;
		File f = new File(fileName);
		if (f.isDirectory()){
			System.out.println("Yes����һ��Ŀ¼ !");
		}
		else {
			System.out.println("No");
		}
		System.out.println("is ok !");
	}

}
