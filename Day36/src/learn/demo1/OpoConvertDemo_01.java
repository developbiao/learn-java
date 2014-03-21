/**
 * @Date:2014/03/19
 * @Discribe:对象转型练习
 * @Author:GongBiao
 */
package learn.demo1;

public class OpoConvertDemo_01 {
	
	public static void main(String[] args){
		
		Animal a = new Animal("name");
		Cat c = new Cat("catname", "blue");
		Dog d = new Dog("dogname", "black");
		
		System.out.println(a instanceof Animal);  //true 
		System.out.println(c instanceof Animal);  //true
		System.out.println(d instanceof Animal);  //true
		System.out.println(a instanceof Dog);
		
	     a = new Dog("汪汪", "yellow");   //向上转型
	     System.out.println(a.name);
	     
	     Dog d1 = (Dog)a;
	     System.out.println(d1.furColor);
	     
	     
		
		System.out.println("is ok !");
	}

}

class Animal {
	public String name;
	
	Animal(String name){
		
		this.name = name;
	}
}

class Cat extends Animal {
	
	public String eyesColor;
	
	Cat(String name, String c){
		
		super(name);
		this.eyesColor = c;
	}
}

class Dog extends Animal {
	
	public String furColor;
	
	Dog(String name, String c){
		
		super(name);
		furColor = c;
	}
	
}


