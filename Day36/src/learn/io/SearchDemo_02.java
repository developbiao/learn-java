/**
 * @Date:2014/03/20
 * @Discribe:递归查找目录 
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;

public class SearchDemo_02 {

	public static void main(String[] args) {

		String fileName = "I:" + File.separator;

		File f = new File(fileName);
		Display(f);

		System.out.println("is ok !");
	}

	private static void Display(File f) {
		// TODO Auto-generated method stub

		if (f != null) {
			if (f.isDirectory()) {
				File[] fileArray = f.listFiles();
				if (fileArray != null) {
					for (int i = 0; i < fileArray.length; i++) {
						Display(fileArray[i]);  //递归调用
					}
				}
			}
			else {
				System.out.println(f);
			}
		}

	}
}
