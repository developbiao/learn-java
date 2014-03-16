/**
 * @Date:2014/03/14
 * @Discribe:把Set扩展成Map
 * @Author:GongBiao
 */
package learn.demo1;

import java.util.HashSet;
import java.util.Map;

public class Set2Map<K, V> extends HashSet<SimpleEntry<K, V>>{
	
	//实现清空所有key-value对的方法
	public void clear(){
		super.clear();
	}
	
	//判断是否包含某个key
	public boolean containsKey(Object key){
		
		return super.contains(
				new SimpleEntry<K, V>(key, null));    //t知识的不足这里有错误
	}
	
	//判断是否包含某个key
	
	public boolean containsKey(Object key){
		for (SimpleEntry<K, V> se: this){
			if (se.getValue().equals(value)){
				return true;
			}
		}
	}
	
	

}


class SimpleEntry<K, V> implements Map.Entry<K, V>, java.io.Serializable{
	
	private final K key;
	private V value;
	
	//定义如下2个构造器
	public SimpleEntry(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public SimpleEntry(Map.Entry<? extends K, ? extends V> entry){
		this.key = entry.getKey();
		this.value = entry.getValue();
	}
	
	//获取key
	
	public K getKey(){
		return key;
	}
	
	//获取value
	
	public V getValue(){
		return value;
	}
	
	//改变该key-value对的value颠倒值
	
	public V setValue(V value){
		V oldValue = this.value;
		this.value = value;
		return oldValue;
	}
	
	//根据key比较2个SimpleEntry是否相等
	
	public boolean equals(Object o){
		if (o == this){
			return true;
		}
		if (o.getClass() == SimpleEntry.class){
			SimpleEntry se = (SimpleEntry)o;
			return se.getKey().equals(getKey());
		}
		return false;
	}
	
	//根据Key计算hashCode
	
	public int hashCode(){
		return key == null ? 0 : key.hashCode();
	}
	public String toString(){
		return key + "=" + value;
	}
}