package pattern.factorymethod.test;

import pattern.factorymethod.component.BajajBike;
import pattern.factorymethod.factory.BajajChennaiFactory;

public class SouthCustomer {
	
	public static void main(String[] args) {
		BajajBike bike = new BajajChennaiFactory().orderBike("Avenger");
		bike.drive();
	}
}
