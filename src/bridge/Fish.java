package bridge;

public class Fish implements Animal{

	@Override
	public String getName() {
		return "Fish";
	}

	@Override
	public boolean livesOnWater() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean livesOnLand() {
		// TODO Auto-generated method stub
		return false;
	}

}
