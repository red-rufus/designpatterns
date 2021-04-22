package pattern.factorymethod.component;

public class BajajPulsar extends BajajBike {

	private float pickupLevel;
	
	@Override
	public void drive() {
		System.out.println("Driving Bajaj Pulsar Bike");
	}

}
