package factory2;

public class CustomerSeller extends BaseCustomer {
	
	public String name;
	public DataDetailSell dataDetail;
	
	public DataDetailSell getDataDetail() {
		return dataDetail;
	}
	public void setDataDetail(DataDetailSell dataDetail) {
		this.dataDetail = dataDetail;
	}
}
