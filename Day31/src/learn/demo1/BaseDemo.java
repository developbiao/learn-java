/**
 * @Date:2014/03/12
 * @Discribe:经典案例父类调用了子类重新的方法
 */
package learn.demo1;

public class BaseDemo {
	
	public static void main(String[] args){
		//new Fu();
		new Zi();
		System.out.println("is ok !");
	}

}

class Fu{
	int i = 3; //归纳
	public Fu(){
		
		this.Display();
	}
	
	public void Display(){
		
		System.out.println(i);
	}
}

class Zi extends Fu{
	
	int i = 33;
	
	public Zi(){
		i = 111;
	}
	
	@Override
	public void Display(){
		System.out.println(i);
	}
}
