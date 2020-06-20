package bridge;

public class Dog extends LandAnimalBridge{

	public String getName() {
		return "Dog";
	}
	
	@Override
	public Integer getLegTotal() {
		return 2;
	}

	@Override
	public Integer getEarTotal() {
		// TODO Auto-generated method stub
		return 2;
	}


}
