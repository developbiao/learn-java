/**
 * @Date:2014/03/14
 * @Discribe:��Set��չ��Map
 * @Author:GongBiao
 */
package learn.demo1;

import java.util.HashSet;
import java.util.Map;

public class Set2Map<K, V> extends HashSet<SimpleEntry<K, V>>{
	
	//ʵ���������key-value�Եķ���
	public void clear(){
		super.clear();
	}
	
	//�ж��Ƿ����ĳ��key
	public boolean containsKey(Object key){
		
		return super.contains(
				new SimpleEntry<K, V>(key, null));    //t֪ʶ�Ĳ��������д���
	}
	
	//�ж��Ƿ����ĳ��key
	
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
	
	//��������2��������
	public SimpleEntry(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public SimpleEntry(Map.Entry<? extends K, ? extends V> entry){
		this.key = entry.getKey();
		this.value = entry.getValue();
	}
	
	//��ȡkey
	
	public K getKey(){
		return key;
	}
	
	//��ȡvalue
	
	public V getValue(){
		return value;
	}
	
	//�ı��key-value�Ե�value�ߵ�ֵ
	
	public V setValue(V value){
		V oldValue = this.value;
		this.value = value;
		return oldValue;
	}
	
	//����key�Ƚ�2��SimpleEntry�Ƿ����
	
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
	
	//����Key����hashCode
	
	public int hashCode(){
		return key == null ? 0 : key.hashCode();
	}
	public String toString(){
		return key + "=" + value;
	}
}