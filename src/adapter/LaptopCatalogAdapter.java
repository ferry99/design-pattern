package adapter;

public class LaptopCatalogAdapter implements CatalogAdapter{

	private Laptop laptop;
	
	public LaptopCatalogAdapter(Laptop laptop) {
		this.laptop= laptop;
	}
	
	@Override
	public String getCatalogTitle() {
		return laptop.getBrand() + ":" + laptop.getPrice();
	}

}
