package abstract_factory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In Case poorhouse always having low quality & low price
		// Using This constructor can be false if one of them is not low (DEPENDENT)		
		House poorHouse = new House(new LowQuality(), new LowPrice());
		poorHouse.define();
		
		//To Make poorhouse always having low quality & low price 
		//We create Abstract Method
		House poorHouse2 = new House(new LowHouseFactory());
		
		House richHouse = new House(new HighHouseFactory());
		
		
		
	}

}
