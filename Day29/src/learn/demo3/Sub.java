/**
 * @Date:2014/03/10
 * @Discribe:����ļ̳з���
 * @Author:GongBiao
 */
package learn.demo3;

public class Sub extends Mid {
	int count = 200;
	public static void main(String[] args){
		
		Sub s = new Sub();  //����������һ��Sub����
		//��Sub��������ת�ͺ�ΪMid, Base����
		Mid s2m = s;
		Base s2b = s;
		System.out.println(s.count);
		System.out.println(s2m.count);
		System.out.println(s2b.count);
		
		
		System.out.println("is ok !");
	}

}

class Base{
	int count = 2;
}

class Mid extends Base{
	int count = 20;
}
