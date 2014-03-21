/**
 * @Date:2014/03/20
 * @Discribe:用使用RandomAccess写入文件
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo_01 {
	
	public static void main(String[] args) throws IOException{
		String fileName = "D:" + File.separator + "hello.log";
		File f = new File(fileName);
		RandomAccessFile demo = new RandomAccessFile(f, "rw");
		demo.writeBytes("adfsdlf");
		demo.writeInt(12);
		demo.writeBoolean(true);
		demo.writeChar('A');
		demo.writeFloat(1.21f);
		demo.writeDouble(12.33344);
		demo.close();
		
		System.out.println("is ok !");
	}
}
