/**
 * @Date:2014/03/10
 * @Discribe:Hide test
 * @Author:	GongBiao
 */
package learn.demo3;

public class HideTest {
	
	public static void main(String[] args){
		
		Dervied d =  new Dervied();
		//System.out.println(d.tag);
		System.out.println(((Parent)d).tag);  //����ת��
		System.out.println("is ok !");
	}

}

class Parent{
	
	public String tag = "����Java����";
}

class Dervied extends Parent{
	
	//���� һ��˽�е�tag
	private String tag;
}
