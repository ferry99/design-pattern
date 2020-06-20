package bridge;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Fish());
		
		//Without bridge we need to check until the concret class
		animals.forEach(animal -> {
			if(animal.livesOnWater()) {
				System.out.println(animal.getName()+ " Lives On Water" );
			}else if(animal.livesOnLand()) {
				System.out.println(animal.getName()+ " Lives On Land" );
			}
		});
		
		
		System.out.println("===============With Bridge==================");
		
		//With Bridge
		animals.forEach(animal -> {
			if(animal instanceof LandAnimalBridge) {
				LandAnimalBridge landAnimal = (LandAnimalBridge) animal;
				System.out.println(landAnimal.getName() + " Lives On Land" + ", Leg Total : " + landAnimal.getLegTotal());
			}else if(animal instanceof WaterAnimalBridge) {
				WaterAnimalBridge waterAnimal = (WaterAnimalBridge) animal;
				System.out.println(waterAnimal.getName()+ " Lives On Water" );
			}
		});
		
	}
}
