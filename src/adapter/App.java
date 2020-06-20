package adapter;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> stuff = new ArrayList<>();
		
		stuff.add(new Laptop("ASUS","50000000"));
		stuff.add(new Laptop("MAC","50000000"));
		
		stuff.add(new Handphone("Samsung", "10000"));
		stuff.add(new Handphone("iphone", "90000"));
		
		//We need to check every class type to display same view
		stuff.forEach(item -> {
			if(item instanceof Laptop) {
				Laptop laptop = (Laptop) item;
				System.out.println(laptop.getBrand() + ":" + laptop.getPrice());
			}else if(item instanceof Handphone){
				Handphone handphone = (Handphone) item;
				System.out.println(handphone.getBrand() + ":" + handphone.getPrice());
			}
		});
		
		//We are Implementing Adapter
		System.out.println("=====ADAPTER VERSION============");
		List<CatalogAdapter> newStuff = new ArrayList<>();
		
		newStuff.add(new LaptopCatalogAdapter(new Laptop("ASUS","50000000")));
		newStuff.add(new LaptopCatalogAdapter(new Laptop("MAC","50000000")));		
			
		newStuff.add(new HandphoneCatalogAdapter(new Handphone("iphone", "90000")));
		
		newStuff.forEach(item -> {
			System.out.println(item.getCatalogTitle());
		});
			
	}

}
