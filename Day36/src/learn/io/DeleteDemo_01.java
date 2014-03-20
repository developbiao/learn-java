/**
 * @Date:2014/03/19
 * @Discribe:删除一个文件
 * @Author:GongBiao
 */
package learn.io;

import java.io.File;


public class DeleteDemo_01 {
	
	public static void main(String[] args){
		
		String fileName = "D:" + File.separator + "hello.log";
		
		File f1 = new File(fileName);
		
		if (f1.exists()){
			f1.delete();
		}else{
			
			System.out.println("文件不存在!");
		}
		
		System.out.println("程序执行完成!");
	}

}
