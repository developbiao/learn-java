/**
 * @Date:2014/03/19
 * @Discribe:Java中的IO整理学习
 */
package learn.io;
import java.io.*;

public class FileDemo_01 {
	
	public static void main(String[] args){
		
		File f = new File("D:\\hello.txt");
		
		try {
			f.createNewFile();
			
		}catch (Exception e){
			
			e.printStackTrace();
		}
		
		System.out.println("执行后会创建一个名为hello的文件!");
	}

}
