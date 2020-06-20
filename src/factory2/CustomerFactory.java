package factory2;


public class CustomerFactory {
	
	public BaseCustomer getType(String type) {
		if(type == "buyer") {
			CustomerBuyer myCustomer =  new CustomerBuyer();
			myCustomer.setName("buyer1");
			myCustomer.getDataDetail().setItemCode("ITEM001");
			return myCustomer;
		}else if(type == "seller"){
			CustomerSeller myCustomer = new CustomerSeller();
			return myCustomer;
		}else {
			return null;
		}
			
		
	}
}
