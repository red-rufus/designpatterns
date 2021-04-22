package pattern.factorymethod.factory;

import pattern.factorymethod.component.BajajBike;

public abstract class BajajFactory {
	protected abstract void paint();
	protected abstract void assemble();
	protected abstract void oiling();
	protected abstract void roadTest();
	protected abstract BajajBike createBike(String type);
	
	public BajajBike orderBike(String type) {
		BajajBike bike = null;
		bike = createBike(type);
		paint();
		assemble();
		oiling();
		roadTest();
		return bike;
	}
}
