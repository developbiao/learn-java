/**
 * @Date:2014/03/10
 * @Discribe:�������ڴ������ϰ03
 * @Author:GongBaio
 */
package learn.demo3;

public class StaticSub extends StaticBase {
	
	//���ඨ��һ��count �����
	static int count = 200;
	public void info(){
		
		System.out.println("���ʱ����count�����:" + count);
		System.out.println("���ʸ����count�����:" + StaticBase.count);
		System.out.println("���ʸ����count����� :" + super.count);
	}
	
	public static void main(String[] args){
		
		StaticSub sb = new StaticSub();
		sb.info();
		
		System.out.println("is ok !");
	}

}

class StaticBase{
	//����һ��count�����
	static int count = 20;
}
