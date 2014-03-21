/*S*
 * @Date:2014/03/20
 * @Discribe:�ж��Ƿ����ļ���δβ
 * @Author:GongBiao
 */
package learn.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamReader_05 {
	
	public static void main(String[] args) throws IOException{
		
		/**
		 * byte ���� new String ����ַ�����������һ���µ�֪ʶ��
		 */
		
		String fileName = "D:" + File.separator + "hello.txt";
		File f = new File(fileName);
		InputStream in = new FileInputStream(f);
		byte[] b = new byte[(int)f.length()];
		
		int count = 0;
		int temp = 0;
		while ((temp = in.read()) != -1){
			b[count ++] = (byte)temp;   //�ؼ��������temp ��ֵ������b
		}
		in.close();
		System.out.println(new String(b));  //�ٰ�byte b toString ���������.
		
		System.out.println("is ok !33");
	}

}
