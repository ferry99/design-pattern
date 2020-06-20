package factory2;

public abstract class BaseCustomer<T> {
	public String name;
	public T data;
	
	public T getData() {
		return this.data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T data() {
		// TODO Auto-generated method stub
		return null;
	}


}
