/**
 * @Date:2014/03/12
 * @Discribe:FaliyDemo
 * @Author:GongBiao
 */
package learn.demo1;

public class finalDemo_01 extends StaticBase {
	
	//�����ٶ���һ��count����
	static int count = 200;
	public void info(){

		System.out.println("���ʱ����count �����:" + count);
		System.out.println("���ʸ����count �����:" + StaticBase.count);
		System.out.println("���ʸ����count �����:" + super.count);
	}
	public static void main(String[] args){
	
		finalDemo_01 sb = new finalDemo_01();
		sb.info();
		System.out.println("is ok !");
	}

}

class StaticBase{
	//����һ��count�����
	static int count = 20;
	
}


