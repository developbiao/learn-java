/**
 * @Date:2014/03/12
 * @Discribe:Final�����ĳ�ʼ����ϰ��
 * @Author:GongBiao
 */
package learn.demo1;

public class FinalInstanceVaribaleTest {
	
	//����final�����ʱ����ֵ
	final static int var1 = "�Һ�����".length();
	final static int var2;
	
	//�ھ�̬��ʼ������Ϊvar2��ֵ��ʼ��ֵ
	static {
		var2 = "����ѧϰ��̵�˼��".length();
	}
	
	public static void main(String[] args){
		
		System.out.println(FinalInstanceVaribaleTest.var1);
		System.out.println(FinalInstanceVaribaleTest.var2);
		
		System.out.println("is ok !");
	}

}
