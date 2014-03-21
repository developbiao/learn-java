/**
 * @Date:2014/03/20
 * @Discribe:字节流
 * @Author:GongBiao
 */
package learn.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Stream_Demo_01 {
	
	public static void main(String[] args) throws IOException{
		
		String fileName = "D:" + File.separator + "hello.txt";
		File f = new File(fileName);
		OutputStream out = new FileOutputStream(f, true);
		String str = "我喜欢你！";
		byte[] b = str.getBytes();
		out.write(b);
		out.close();
		
		
		System.out.println("文件已写入1");
	}

}
