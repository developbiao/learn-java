/**
 * @Date:2014/03/18
 * @Discribe:设计一个动物类的转型
 * @Author:GongBiao
 */
package learn.com;

public class ConvertDemo {
	
	public static void main(String[] args){
		
		new Cat("colck", 7).Info();
		
		 Cat c1 = new Cat("lod", 3);
		 Animal a1 = new  Animal("小狗", 3);
		 
		 //向下转型
//		Cat a2 = (Cat)a1;
//		a2.Info();
		 
		 //向上转型
		 
		 Animal a3 = (Animal)c1;
		 c1.Bray();
		
		
		System.out.println("is ok !");
	}

}

class Animal {
	
	public int age;
	public String name;
	
	public Animal (String name, int age ){
		
		this.age = age;
		this.name = name;
	}
	
	
	public void Bray(){
		System.out.println(name + "哈哈叫!" + "age" + age);
	}
	
	
	
}

class Cat extends Animal{
	
	private String color;
	
	Cat(String name, int age){
		this(name, age,"blue");  //color已确定下来去调用当前正在初始化的对象3了参数的
		
	}
	
	Cat(String name, int age, String color){
		super(name, age);
		this.color = color;
	}
	
	public void Info(){
		
		System.out.println(name + ":" + age + ":" + color + ":");
	}
}
