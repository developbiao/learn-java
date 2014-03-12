package learn.demo2;

public class FieldAndMethodTest {
	
	public static void main(String[] args){
		Base b = new Base();  //����������һ��Base����
		System.out.println(b.count);
		b.Display();
		
		System.out.println("��������������������������������");
		
		Derived d = new Derived();  //����������һ��Derived����
		System.out.println(d.count);
		d.Display();
		
		System.out.println("��������������������������������");
		
		Base bd = new Derived();  //����ת��
		System.out.println(bd.count);
		bd.Display();
		
		System.out.println("��������������������������������");
		//֤d2b����ָ��ԭd������ָ���Derived����
		Base d2d = d;   //ָ��ͬһ����
		System.out.println(d2d.count);
		d2d.Display();
		if (d2d == d){
			System.out.println("������ͬһ����");   //˵�������������ڴ�
		}
		
		
		System.out.println("is ok !");
	}

}

class Base{
	
	int count = 2;
	public void Display(){
		System.out.println(this.count);
	}
}

class Derived extends Base{
	
	int count = 20;
	@Override
	public void Display(){
		System.out.println(this.count);
	}
}


