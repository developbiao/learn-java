/**
 * @Date:2014/03/20
 * @Discribe:将文件中的字节一个字节的写入字符串
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
		//String str = "你好龚彪!";
		String str = "\r\n你好龚彪!";   //换行
		byte[] b = str.getBytes();
		for (int i = 0 ; i < b.length; i ++){
			out.write(b[i]);  //一个一个的写入
		}
		
		out.close();   
		System.out.println("is ok !");
	}

}
