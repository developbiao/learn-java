package learn.base;


public class Test_02 {
	
	public static void main(String[] args){
		System.out.println(new Wolf("huihui", 32.3));
		System.out.println("is ok!");
	}

}

class Animal{
	//desc ʵ�������������toString�����ķ���ֵ
	
	private String desc;
	public Animal(){
		
		//����getDesc()������ʼ��descʵ������
		this.desc = getDesc();
	}
	
	public String getDesc(){
		return "Animal";
	}
	
	public String toString(){
		//return desc;  //������Ĺ��캯��֮ǰִ��
		return getDesc();  //�������
	}
}

class Wolf extends Animal{
	
	private String name;
	private double weight;
	public Wolf(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	
	//��д�����getDesc()����
	@Override
	public String getDesc(){
		return "Wolf[name=" + name + ",weight=" + weight + "]";
	}
}
