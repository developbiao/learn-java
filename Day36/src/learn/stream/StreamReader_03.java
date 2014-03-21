/**
 * @Date:2014/03/20  10:59
 * @Discribe:自定义读取
 * @Author:GongBiao
 * 
 */
package learn.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamReader_03 {
	
	public static void main(String[] args) throws IOException{
		
		String fileName = "D:" + File.separator + "hello.txt";
		File f = new File(fileName);
		InputStream in = new FileInputStream(f);
		byte[] b = new byte[1024];
		int len = in.read(b);
		System.out.println("读取的长度是:" + len);
		System.out.println(new String(b, 0, len));
		in.close();
		System.out.println("is ok !");
	}

}
