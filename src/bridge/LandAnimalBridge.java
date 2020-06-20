package bridge;

public abstract class LandAnimalBridge implements Animal{
	public boolean livesOnWater() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean livesOnLand() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public Integer getLegTotal() {
		return 2;
	}

	public abstract Integer getEarTotal();
}
