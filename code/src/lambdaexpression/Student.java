package lambdaexpression;

public class Student extends Object {
	private int sid;
	private String name;
	private int phone;
	public Student(int sid, String name, int phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
       return ""+sid+" "+name+" "+phone;
//		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
	
}
