/**
 * @Date:2014/03/19  17:28
 * @Discribe:File类加入两个常量
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;
import java.io.IOException;

public class FileDemo_02 {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println(File.separator);   //linux env 通用的的  separator
		System.out.println(File.pathSeparator);  //pathSeparator;
		
		String fileName = "D:" + File.separator + "hello.log";
		File f1 = new File(fileName);
		f1.createNewFile();
		
		
		
		System.out.println("is ok !");
	}

}
