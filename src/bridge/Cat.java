package bridge;

public class Cat extends LandAnimalBridge{

	public String getName() {
		return "Cat";
	}

	@Override
	public Integer getEarTotal() {
		// TODO Auto-generated method stub
		return 2;
	}
}

