/*S*
 * @Date:2014/03/20
 * @Discribe:判断是否到了文件的未尾
 * @Author:GongBiao
 */
package learn.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamReader_05 {
	
	public static void main(String[] args) throws IOException{
		
		/**
		 * byte 数组 new String 变成字符串对象，这是一个新的知识点
		 */
		
		String fileName = "D:" + File.separator + "hello.txt";
		File f = new File(fileName);
		InputStream in = new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		
		int count = 0;
		int temp = 0;
		while ((temp = in.read()) != -1){
			b[count ++] = (byte)temp;   //关键在这里，把temp 的值赋给了b
		}
		in.close();
		System.out.println(new String(b));  //再把byte b toString 就输出来了.
		
		System.out.println("is ok !33");
	}

}
