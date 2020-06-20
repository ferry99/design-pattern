package factory2;

public class GenericCustomer<T> {
	public String name;
	public T data;
	
	public T getData() {
		return data;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public GenericCustomer(T data) {
		this.data = data;
	}

	public GenericCustomer() {
	}
}
