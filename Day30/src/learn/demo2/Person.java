package learn.demo2;

 class Person {
	
	public Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	private int age;
	private String name;
	
	
	//method
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	

	
	public void Say(){
		System.out.println("Hello My Name is :" + name + "My age is : " + age);
	}
	

}
 
