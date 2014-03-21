/**
 * @Date:2014/03/20
 * @Discribe:读取文件操作
 * @Author:GongBiao
 */
package learn.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamReaderDmeo_01 {
	
	public static void main(String[] args) throws IOException{
		
		String fileName = "D:" + File.separator + "hello.txt";
		InputStream in = new FileInputStream(fileName);
		byte[] b = new byte[1024];   //buffer
		int len = in.read(b);
		in.close();
		System.out.println("读入的长度为:" + len);
		System.out.println(new String(b, 0 ,len));
		
		System.out.println("is ok !");
	}

}
