package bridge;

public class Dog implements Animal{

	@Override
	public String getName() {
		return "Dog";
	}

	@Override
	public boolean livesOnWater() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean livesOnLand() {
		// TODO Auto-generated method stub
		return true;
	}

}
