package pattern.factorymethod.factory;

import pattern.factorymethod.component.BajajAvenger;
import pattern.factorymethod.component.BajajBike;
import pattern.factorymethod.component.BajajPlatina;
import pattern.factorymethod.component.BajajPulsar;

public class BajajNoidaFactory extends BajajFactory{
	protected void paint() {
		System.out.println("Painting Bajaj Bike");
	}
	
	protected void assemble() {
		System.out.println("Assembling Bajaj Bike");
	}
	
	protected void roadTest() {
		System.out.println("Road Testing Bajaj Bike");
	}
	
	protected void oiling() {
		System.out.println("Oiling Bajaj Bike");
	}
	
	protected BajajBike createBike(String type) {
		BajajBike bike = null;
		if(type.equalsIgnoreCase("Pulsar")) {
			bike = new BajajPulsar();
		}else if(type.equalsIgnoreCase("Avenger")) {
			bike = new BajajAvenger();
		}else if(type.equalsIgnoreCase("Platina")) {
			bike = new BajajPlatina();
		}else {
			throw new IllegalArgumentException("Invalid Bike Type");
		}
		return bike;
	}
}
