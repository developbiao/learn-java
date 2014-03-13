/**
 * @Date:2014/03/12/16:02
 * @Discribe:��������ʹ�þֲ�����Ҫʹ��final����
 */
package learn.demo1;

import java.util.Arrays;

public class CommandTest {
	
	//����һ����������ָ�����ȵ����飬��ÿ������Ԫ����cmd�������
	public int[] process(IntArrayProductor cmd, int length){
		int[] result = new int[length];
		for (int i = 0; i < length; i++){
			result[i] = cmd.product();
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		CommandTest ct = new CommandTest();
		final int seed = 5;
		//�������飬�������ɷ���ȡ����IntArrayProduct�ӿڵ�������ʵ����
		
		int[] result = ct.process(new IntArrayProductor(){
			public int product(){
				return (int)Math.round(Math.random() * seed);
			}
		}, 6);
		
		System.out.println(Arrays.toString(result));
		
		System.out.println("is ok !");
	}
	
}

interface IntArrayProductor{
	//�ӿ��ﶨ���product����������������Ϊ��
	int product();
}
