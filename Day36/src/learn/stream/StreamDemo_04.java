/**
 * @Date:2014/03/20  11:07
 * @Discribe:�ֽ�������ϰ�����ļ����ݽ�ʡ�ռ�
 * @Author:GongBiao
 */
package learn.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamDemo_04 {
	
	public static void main(String[] args) throws IOException{
		
		String fileName = "D:" + File.separator + "hello.txt";
		File f = new File(fileName);
		InputStream in = new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		//int len =  in.read(b);
		in.read(b);  //���뵽�ڴ� 
		in.close();
		System.out.println("�ļ��ĳ���Ϊ:" + f.length());
		System.out.println(new String(b));
		
		System.out.println("is ok !");
	}

}
