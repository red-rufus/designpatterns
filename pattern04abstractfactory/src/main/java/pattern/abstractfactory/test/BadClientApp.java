package pattern.abstractfactory.test;

import pattern.abstractfactory.dao.DAO;
import pattern.abstractfactory.factory.DAOFactory;
import pattern.abstractfactory.factory.DAOFactoryBuilder;

public class BadClientApp {

	public static void main(String[] args) {
		DAOFactory dbFactory = DAOFactoryBuilder.buildDaoFactory("DB");
		DAO studentDao = dbFactory.createDAO("student");
		DAO courseDao = dbFactory.createDAO("course");
		studentDao.insert();
		courseDao.insert();
	}

}
