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
		System.out.println(((Parent)d).tag);  //向上转型
		System.out.println("is ok !");
	}

}

class Parent{
	
	public String tag = "疯狂的Java进义";
}

class Dervied extends Parent{
	
	//定义 一个私有的tag
	private String tag;
}
