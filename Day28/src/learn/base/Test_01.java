/**
 * @Date:2014/03/09
 * @Discribe:������������ʵ������
 * @Author:GongBiao
 */
package learn.base;

public class Test_01 {
	
	public static void main(String[] args){
		new Derived();
		//new Base();
		System.out.println("is ok!");
	}

}

class Base{
	
	//����һ����Ϊi��ʵ������
	private int i = 2;
	public Base(){
		//ֱ�����this.i
		System.out.println(this.i);  //��Ȼ��Derived�Ķ����Ǳ���������base
		this.Display();  //this�������ڳ�ʼ���Ķ���  ���ڳ�ʼ���Ķ�����Derived
		//���this.ʵ�ʵ�����,������Derived
		System.out.println(this.getClass());
	}
	public void Display(){
		System.out.println(i);
	}
	
	
}

//�̳�Base��Derived����

class Derived extends Base{
	
	//����һ����Ϊi��ʵ������ 
	private int i = 22;
	
	public Derived(){
		//���Եĵ�����base
		i = 222;
	}
	
	public void Display(){
		System.out.println(i);
	}
}
