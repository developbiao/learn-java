/**
 * @Date:2014/03/13
 * @Discribe:ͨ���������޸�����Ĵ�С
 * @Author:GongBiao
 */
package learn.reflection;
import java.lang.reflect.Array;

public class ReflectionDemo_05 {
	
	public static void main(String[] args){
		
		int[] intArray = {1, 2, 3, 4, 5}; 
		int[] newIntArray = (int[]) changeArraySize(intArray, 10);  //�ı�����ĳ���
		print(newIntArray);
		
		String[] atr = {"a", "b", "c", "d", "e"};
		String[] str = (String[]) changeArraySize(atr, 10);
		print(str);
		
		
		
		System.out.println("is ok !");
	}

	//�޸�����Ĵ�С
	public static Object changeArraySize(Object obj, int len) {
		
		Class<?> arr = obj.getClass().getComponentType();
		Object newArray = Array.newInstance(arr, len);
		
		//��������
		int co = Array.getLength(obj);
		System.arraycopy(obj, 0, newArray, 0, co);
		
		return newArray;
		
		
	}
	
	//��ӡ
	
	public static void print(Object obj){
		Class<?> c = obj.getClass();
		if (!c.isArray()){
			return;
		}
		
		System.out.print("\nArray length:" + Array.getLength(obj));
		
		for (int i = 0; i < Array.getLength(obj); i++){
			System.out.println(Array.get(obj, i) + " ");
		}
	}
	
	

}

		
