package bridge;

public class Cat implements Animal{

	@Override
	public String getName() {
		return "Cat";
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

