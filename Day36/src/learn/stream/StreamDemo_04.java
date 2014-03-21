/**
 * @Date:2014/03/20  11:07
 * @Discribe:字节流的练习，读文件内容节省空间
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
		in.read(b);  //输入到内存 
		in.close();
		System.out.println("文件的长度为:" + f.length());
		System.out.println(new String(b));
		
		System.out.println("is ok !");
	}

}
