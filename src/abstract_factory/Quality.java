package abstract_factory;

public interface Quality {
	public void define();
}

class LowQuality implements Quality {

	
	@Override
	public void define() {
		System.out.println("Low Quality");		
	}
	
}

class HighQuality implements Quality {

	@Override
	public void define() {
		System.out.println("High Quality");		
	}
	
}
