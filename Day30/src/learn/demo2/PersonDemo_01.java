package learn.demo2;

public class PersonDemo_01 {
	
	public static void main(String[] args){
		
		Person p1 = new Person("王儿小", 13);
		Person p2 = new Person("李小五", 15);
		
		p1.Say();
		p2.Say();
		
		System.out.println("is ok !");
	}

}
