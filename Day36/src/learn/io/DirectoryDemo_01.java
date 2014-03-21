/**
 * @Date:2014/03/20
 * @Discribe:判断一个路径是否为目录
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;

public class DirectoryDemo_01 {
	
	public static void main(String[] args){
		/**
		 * 使用isDirectory判断一个指定的路径是否为目录 
		 */
		String fileName = "F:" + File.separator;
		File f = new File(fileName);
		if (f.isDirectory()){
			System.out.println("Yes这是一个目录 !");
		}
		else {
			System.out.println("No");
		}
		System.out.println("is ok !");
	}

}
