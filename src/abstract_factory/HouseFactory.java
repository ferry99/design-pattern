package abstract_factory;

public interface HouseFactory {
	
	public Quality createQuality();
	public Price createPrice();
}

class LowHouseFactory implements HouseFactory{
	
	@Override
	public Quality createQuality() {
		return new LowQuality();
	}

	@Override
	public Price createPrice() {
		return new LowPrice();
	}
}


class HighHouseFactory implements HouseFactory{
	
	@Override
	public Quality createQuality() {
		return new HighQuality();
	}

	@Override
	public Price createPrice() {
		return new HighPrice();
	}
}

