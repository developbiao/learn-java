/**
 * @Date:2014/03/14
 * @Discribe:根据Person类,Student类设计Teacher类实现继承关系
 * @Author:GongBiao
 */
package learn.demo2;

public class PersonTest_01 {
	
	public static void main(String[] args){
		
		Person p1 = new Person("小明");
		Person p2 = new Person("小伍", "ChangSha");
		
		Student s1 = new Student("小白菜", "上海市");
		Student s2 = new Student("王儿蛋", "怀化", "怀化小学");
		
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
		this(name, school, "Chengdu");  //注意这个代码
	}
	
	Student(String n, String l, String school){
		super(n,l);
		this.school = school;
	}
	
	public String Info() {
		return super.Info() + "School:" +school;
	}
}
