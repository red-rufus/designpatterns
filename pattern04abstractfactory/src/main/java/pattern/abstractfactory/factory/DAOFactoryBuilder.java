package pattern.abstractfactory.factory;

public class DAOFactoryBuilder {
	public static DAOFactory buildDaoFactory(String storageType) {
		if(storageType.equalsIgnoreCase("DB")) {
			return new DBDAOFactory();
		} else if(storageType.equalsIgnoreCase("Excel")) {
			return new ExcelDAOFactory();
		} else {
			throw new IllegalArgumentException("Invalid Storage Type");
		}
	}
}
