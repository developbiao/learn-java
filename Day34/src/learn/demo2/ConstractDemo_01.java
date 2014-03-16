/**
 * @Date:2014/03/14
 * @Discribe:���캯���ļ�д
 * @Author:GongBiao
 */
package learn.demo2;

public class ConstractDemo_01 {
	
	public static void main(String[] args){
		
		Dog d = new Dog("����", 3, 7);
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
	
	//����
	
	public String Method(){
		return "Name:" + name + "Age" + age;
	}
}

class Dog extends Pet{
	
	private int id;
	
	public Dog(String name, int id){
		
		this(name, id, 7); //����һ������Ĺ��캯��
		
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
