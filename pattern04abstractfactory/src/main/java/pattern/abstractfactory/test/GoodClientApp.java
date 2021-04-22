package pattern.abstractfactory.test;

import pattern.abstractfactory.dao.DAO;
import pattern.abstractfactory.factory.DAOFactory;
import pattern.abstractfactory.factory.DAOFactoryBuilder;

public class GoodClientApp {

	public static void main(String[] args) {
		DAOFactory excelFactory = DAOFactoryBuilder.buildDaoFactory("Excel");
		DAO studentDao = excelFactory.createDAO("student");
		DAO courseDao = excelFactory.createDAO("course");
		studentDao.insert();
		courseDao.insert();
	}

}
