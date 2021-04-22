package pattern.factorymethod.test;

import pattern.factorymethod.component.BajajBike;
import pattern.factorymethod.factory.BajajNoidaFactory;

public class NorthCustomer {
	
	public static void main(String[] args) {
		BajajBike bike = new BajajNoidaFactory().orderBike("Pulsar");
		bike.drive();
	}
}
