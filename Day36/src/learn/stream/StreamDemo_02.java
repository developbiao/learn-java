/**
 * @Date:2014/03/20
 * @Discribe:���ļ��е��ֽ�һ���ֽڵ�д���ַ���
 */
package learn.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamDemo_02 {
	
	public static void main(String[] args) throws IOException{
		
		String fileName = "D:" + File.separator + "hello.txt";
		File f = new File(fileName);
		OutputStream out = new FileOutputStream(f, true);
		//String str = "��ù���!";
		String str = "\r\n��ù���!";   //����
		byte[] b = str.getBytes();
		for (int i = 0 ; i < b.length; i ++){
			out.write(b[i]);  //һ��һ����д��
		}
		
		out.close();   
		System.out.println("is ok !");
	}

}
