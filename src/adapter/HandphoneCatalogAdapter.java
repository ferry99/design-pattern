package adapter;

public class HandphoneCatalogAdapter implements CatalogAdapter{

	private Handphone handphone;
	
	public HandphoneCatalogAdapter(Handphone handphone) {
		this.handphone = handphone;
	}
	
	@Override
	public String getCatalogTitle() {
		return handphone.getBrand() + ":" + handphone.getPrice();
	}
	
}
