/**
 * @Date:2014/03/12/16:02
 * @Discribe:匿名类中使用局部变量要使用final修饰
 */
package learn.demo1;

import java.util.Arrays;

public class CommandTest {
	
	//定义一个方法生成指定长度的数组，但每个数组元素由cmd负责产生
	public int[] process(IntArrayProductor cmd, int length){
		int[] result = new int[length];
		for (int i = 0; i < length; i++){
			result[i] = cmd.product();
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		CommandTest ct = new CommandTest();
		final int seed = 5;
		//生成数组，具体生成方法取决于IntArrayProduct接口的匿名类实现类
		
		int[] result = ct.process(new IntArrayProductor(){
			public int product(){
				return (int)Math.round(Math.random() * seed);
			}
		}, 6);
		
		System.out.println(Arrays.toString(result));
		
		System.out.println("is ok !");
	}
	
}

interface IntArrayProductor{
	//接口里定义的product方法用来“处理行为”
	int product();
}
