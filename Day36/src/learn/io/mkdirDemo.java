/**
 * @Date:2014/03/19
 * @Discribe:mkdir��File�������
 * @Author:Gongbiao
 */
package learn.io;

import java.io.File;
import java.io.IOException;

public class mkdirDemo {
	
	public static void main(String[] args){
		
		String mkName = "D:" + File.separator + "myfile";
		
		File f = new File(mkName);
		try{
			f.mkdir();
			System.out.println("�ļ��д���succeful!");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("is ok !");
	}

}
