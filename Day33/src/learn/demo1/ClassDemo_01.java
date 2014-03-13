/**
 * @Date:2014/03/13
 * @Discribe:Animal类的设计
 * @Author:Gongbiao
 */
package learn.demo1;

public class ClassDemo_01 {
	
	public static void main(String[] args){
		
		Cat cat = new Cat(3, "Tom");
		cat.Brathe();
		cat.CatchMouse();
		
		System.out.println("is ok !");
	}

}

class Animal{
	
	public int age;
	public String name;
	
	public Animal(int age, String name){
		this.age = age;
		this.name = name;
		
	}
	
	//Proterces
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
		
	}
	
	//String name protices
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	
	
	
	public void Brathe(){
		System.out.println("Animal 呼吸！");
	}
	
}


class Dog extends Animal{
	
	public Dog(int age, String name) {
		super(age, name);
		//调用父类构造器
	}

	@Override
	public void Brathe(){
		System.out.println("Dog 也会呼吸！");
	}
	
	public void Bray(){
		System.out.println(this.name + "::" + this.age + "WOWO叫!");
	}
}

class Cat extends Animal{
	
	public Cat(int age, String name){
		super(age, name);
		
	}
	
	//Cat method
	
	public void CatchMouse(){
		System.out.println(this.name + "..." + this.age + "..." + "会抓老鼠!");
	}
	
	@Override
	public void Brathe(){
		System.out.println(this.name + "会呼吸！");
	}
	
}