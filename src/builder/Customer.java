package builder;

public class Customer {
	private String name;
	
	private String gender;
	
	private Integer age;
	
	private String address;
	
	public Customer(String name , String gender , Integer age, String address) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}


	public String toString() {
		return this.name + "," + this.address + "," + this.age + "," + this.gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
  
}


