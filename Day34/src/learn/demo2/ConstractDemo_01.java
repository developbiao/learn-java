/**
 * @Date:2014/03/14
 * @Discribe:构造函数的简定写
 * @Author:GongBiao
 */
package learn.demo2;

public class ConstractDemo_01 {
	
	public static void main(String[] args){
		
		Dog d = new Dog("汪汪", 3, 7);
		String str = d.Method();
		System.out.println(str);
		
		System.out.println("is ok !");
	}

}

class Pet{
	private String name;
	private int age;
	public Pet(String name){
		
		this.name = name;
	}
	
	public Pet(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//方法
	
	public String Method(){
		return "Name:" + name + "Age" + age;
	}
}

class Dog extends Pet{
	
	private int id;
	
	public Dog(String name, int id){
		
		this(name, id, 7); //这是一个神奇的构造函数
		
	}
	
	public Dog(String name, int age, int id){
		super(name, age);
		this.id = id;
	}
	
	
	
	@Override
	public String Method(){
		
		return super.Method() + "Id:" +id;
	}
}
