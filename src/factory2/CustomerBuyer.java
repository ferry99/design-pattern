package factory2;

public class CustomerBuyer<T> extends BaseCustomer {
	
	public String name;
	public T data;
	public DataDetailBuy dataDetail;
	
	@Override
	public T data() {
		return this.data;
	}
	
	public DataDetailBuy getDataDetail() {
		return dataDetail;
	}
	
	public void setDataDetail(DataDetailBuy dataDetail) {
		this.dataDetail = dataDetail;
	}
	
	public CustomerBuyer(T data) {
		this.data = data;
	}
	

}
