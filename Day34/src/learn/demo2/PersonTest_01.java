/**
 * @Date:2014/03/14
 * @Discribe:����Person��,Student�����Teacher��ʵ�ּ̳й�ϵ
 * @Author:GongBiao
 */
package learn.demo2;

public class PersonTest_01 {
	
	public static void main(String[] args){
		
		Person p1 = new Person("С��");
		Person p2 = new Person("С��", "ChangSha");
		
		Student s1 = new Student("С�ײ�", "�Ϻ���");
		Student s2 = new Student("������", "����", "����Сѧ");
		
		String str1 =  p1.Info();
		String str2 =  p2.Info();
		
		String str3 =  s1.Info();
	    String str4 =  s2.Info();
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
	    System.out.println(str4);
		
		System.out.println("is ok!");
	}

}

class Person{
	
	private String name;
	private String location;
	
	Person(String name){
		this.name = name;
		location = "Chengdu";
	}
	
	Person(String name, String location){
		this.name = name;
		this.location = location;
	}
	
	public String Info() {
		return "name:" + name + "localtion:" +location; 
	}
}

class Student extends Person{
	private String school;
	Student(String name, String school){
		this(name, school, "Chengdu");  //ע���������
	}
	
	Student(String n, String l, String school){
		super(n,l);
		this.school = school;
	}
	
	public String Info() {
		return super.Info() + "School:" +school;
	}
}
