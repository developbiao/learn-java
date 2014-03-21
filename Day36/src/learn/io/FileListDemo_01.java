/**
 * @Date:2014/03/20
 * @Discribe:File类的练习列出指定目录的全部文件
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;

public class FileListDemo_01 {
	
	public static void main(String[] args){
		String fileName = "E:" + File.separator;
		File f1 = new File(fileName);
		String[] str = f1.list();
		
		for (String strs : str){
			System.out.println(strs);
		}
		
		System.out.println("is ok !");
	}
}
