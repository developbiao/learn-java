/**
 * @Date:2014/03/20
 * @Discribe:搜索指定目录的全部内容
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;

public class SeachDemo_01 {

	public static void main(String[] args) {

		String fileName = "D:" + File.separator;
		File f = new File(fileName);
		print(f);
		System.out.println("is ok !");
	}

	public static void print(File f) {
		if (f != null) {
			if (f.isDirectory()) {
				File[] fileArray = f.listFiles();
				for (int i = 0; i < fileArray.length; i++) {
					print(fileArray[i]);
				}
			} else {
				System.out.println(f);
			}
		}

	}

}
