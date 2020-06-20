package bridge;

public abstract class WaterAnimalBridge implements Animal{
	
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
