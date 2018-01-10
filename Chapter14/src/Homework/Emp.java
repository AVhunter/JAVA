package Homework;

public class Emp {
	private String e_id;
	private String e_name;
	public Emp(String id,String name) {
		this.e_id=id;
		this.e_name=name;
	}
	public String getId() {
		return e_id;
	}
	public String getName() {
		return e_name;
	}
	public void setId(String id) {
		this.e_id=id;
	}
	public void setName(String name) {
		this.e_name=name;
	}
}
