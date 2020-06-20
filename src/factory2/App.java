package factory2;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerFactory customerFactory = new CustomerFactory();
		
//		BaseCustomer person1 = customerFactory.getType("buyer");
		CustomerBuyer person1= (CustomerBuyer) customerFactory.getType("buyer");
		
		
//		if(person1 instanceof CustomerBuyer){
//			((CustomerBuyer) person1).getDataDetail().getItemName();
//		}
		
				
		CustomerSeller person2= (CustomerSeller) customerFactory.getType("seller");
		
		person1.getName();
		person1.getDataDetail();
		
		
		person2.getName();
		Integer price = person2.getDataDetail().getProfit();
		
		
		//Using generic
		BaseCustomer customer = null;
		if(true) {
			DataDetailBuy dataDetailBuy = new DataDetailBuy();
			customer = new CustomerBuyer<>(dataDetailBuy);			
		}else {
			DataDetailSell dataDetailSell = new DataDetailSell();
//			customer = new CustomerSeller<>(dataDetailSell);		
		}
		
//		customer.getData().
		
	
		

	}
	
	

}
