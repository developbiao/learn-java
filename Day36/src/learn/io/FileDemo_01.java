/**
 * @Date:2014/03/19
 * @Discribe:Java�е�IO����ѧϰ
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
		
		System.out.println("ִ�к�ᴴ��һ����Ϊhello���ļ�!");
	}

}
