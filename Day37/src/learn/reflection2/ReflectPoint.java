/**
 * @Discribe:ReflectPoint
 */
package learn.reflection2;

public class ReflectPoint {
	
	private String str1;
	private String str2;
	private String str3;
	public ReflectPoint(String str1, String str2, String str3) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public String getStr3() {
		return str3;
	}
	public void setStr3(String str3) {
		this.str3 = str3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str1 + ":" + str2 + ":" + str3;
	}
	
	
	

}
