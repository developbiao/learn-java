/**
 * @Date:2014/03/20
 * @Discribe:列出指定目录的全部文件（包括隐藏文件）
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;

public class FileListDemo_02 {
	
	public static void main(String[] args){
		
		String fileName = "d:" + File.separator;
		File f1 = new File(fileName);
		File[] str = f1.listFiles();
		for (int i = 0; i < str.length; i ++){
			System.out.println(str[i]);
		}
		
		System.out.println("is ok !");
	}

}
