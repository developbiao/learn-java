/**
 * @Date:2014/03/18
 * @Discribe:���������÷�
 * @Author:GongBiao
 */
package learn.demo2;

public class PersonDemo {
	
	public static void main(String[] args){
		
		new Student("zhangshang", "changsha").Info();
		
		System.out.println("is ok !");
	}

}

class Person{
	public String name;
	public String location;
	
	Person (String name, String location){
		this.name = name;
		this.location = location;
	}
}

class Student extends Person{
	private String school;
	Student(String name, String school){
		this(name,  "Chengdu",school);  //ע���������
	}

	Student(String n, String l, String school){
		super(n,l);
		this.school = school;
	}
	
	
	public void Info(){
		

		System.out.println("name:" + name + "localtion:" + location + "schol" + school);
	}

	
}