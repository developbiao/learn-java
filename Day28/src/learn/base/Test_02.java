package learn.base;


public class Test_02 {
	
	public static void main(String[] args){
		System.out.println(new Wolf("huihui", 32.3));
		System.out.println("is ok!");
	}

}

class Animal{
	//desc 实例变量保存对象toString方法的返回值
	
	private String desc;
	public Animal(){
		
		//调用getDesc()方法初始化desc实例变量
		this.desc = getDesc();
	}
	
	public String getDesc(){
		return "Animal";
	}
	
	public String toString(){
		//return desc;  //在子类的构造函数之前执行
		return getDesc();  //解决方案
	}
}

class Wolf extends Animal{
	
	private String name;
	private double weight;
	public Wolf(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	
	//重写交类的getDesc()方法
	@Override
	public String getDesc(){
		return "Wolf[name=" + name + ",weight=" + weight + "]";
	}
}
