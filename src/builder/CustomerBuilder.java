package builder;

public class CustomerBuilder {
	private String name;
	
	private String gender = "unknown";
	
	private Integer age = 0;
	
	private String address = "default";

	public String getName() {
		return name;
	}

	public CustomerBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public CustomerBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public CustomerBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public CustomerBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	
	public Customer build() {
		return new Customer(
			this.name,
			this.gender,
			this.age,
			this.address
		);
	}
}
