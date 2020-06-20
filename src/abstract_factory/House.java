package abstract_factory;

public class House {
	
	private Quality quality;
	private Price price;
	
	House(Quality quality, Price price){
		this.quality = quality;
		this.price = price;
	}
	
	House(HouseFactory houseFactory){
		this.quality = houseFactory.createQuality();
		this.price = houseFactory.createPrice();
	}
	
   public void define() {
	   this.quality.define();
	   this.price.define();
   }

}
