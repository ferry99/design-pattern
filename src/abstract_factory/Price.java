package abstract_factory;

public interface Price {
	public void define();
}

class LowPrice implements Price{

	@Override
	public void define() {
		System.out.println("Low Price");		
	}	
}

class HighPrice implements Price{

	@Override
	public void define() {
		System.out.println("High Price");		
	}	
}
