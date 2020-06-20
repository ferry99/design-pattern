package interfaces;

public class Chicken implements Animal{
	
	@Override
	public String move() {
		// TODO Auto-generated method stub
		return "chicken is walking";
	}
	
	public Boolean getAlive() {
		return this.alive;
	}
}
