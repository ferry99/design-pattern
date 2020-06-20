package bridge;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Fish());
		
		animals.forEach(animal -> {
			if(animal.livesOnWater()) {
				System.out.println(animal.getName()+ " Lives On Water" );
			}else if(animal.livesOnLand()) {
				System.out.println(animal.getName()+ " Lives On Land" );
			}
		});
		
	}
}
