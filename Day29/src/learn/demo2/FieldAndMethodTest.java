package learn.demo2;

public class FieldAndMethodTest {
	
	public static void main(String[] args){
		Base b = new Base();  //声明并创建一个Base对象
		System.out.println(b.count);
		b.Display();
		
		System.out.println("————————————————");
		
		Derived d = new Derived();  //声明并创建一个Derived对象
		System.out.println(d.count);
		d.Display();
		
		System.out.println("————————————————");
		
		Base bd = new Derived();  //向上转型
		System.out.println(bd.count);
		bd.Display();
		
		System.out.println("————————————————");
		//证d2b变量指向原d变量所指向的Derived对象
		Base d2d = d;   //指向同一对象
		System.out.println(d2d.count);
		d2d.Display();
		if (d2d == d){
			System.out.println("它们是同一对象");   //说明分配了两块内存
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


