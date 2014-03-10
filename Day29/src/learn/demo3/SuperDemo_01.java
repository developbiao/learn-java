/**
 * @Date:2014/03/10
 * @Discribe:Super�ؼ���������ʲô
 * @Author:GongBiao
 */
package learn.demo3;

public class SuperDemo_01 {
	
	public static void main(String[] args){
		
		//����һ��Apple����
		Apple a = new Apple();
		//����getSuper()������ȡApple���������super����
		Fruit f = a.getThis();
		//�ж�a��f�Ĺ�ϵ
		System.out.println("a�͵������õĶ����Ƿ���ͬ��" + (a == f));
		System.out.println("����a�����õĶ����colorʵ������:" + a.color);
		System.out.println("����f �����ö����colorʵ��������" + f.color);
		//�ֱ�ͨ��a,f��������������info����
		a.info();
		f.info();
		//����AccessSuperInofҵ���ø����info()����
		a.AccessSuperInfo();
		
		System.out.println("is ok ");
	}

}

class Fruit {
	
	String color = "δȷ����ɫ";
	
	//���� һ���������÷������ص��ø÷�����ʵ��
	public Fruit getThis(){
		return this;  //����return super,������return this
		
	}
	
	public void info(){
		System.out.println("Fruit ����");
	}
	
}

class Apple extends Fruit{
	
	//��д����ķ���
	@Override
	public void info(){
		
		System.out.println("Apple ����");
	}
	
	//ͨ��super���ø����info()����
	public void AccessSuperInfo(){
		super.info();
	}
	
	//���Է���super�ؼ��ִ��������
	
	public Fruit getSuper(){
		return super.getThis();
	}
	String color = "��ɫ";
}
