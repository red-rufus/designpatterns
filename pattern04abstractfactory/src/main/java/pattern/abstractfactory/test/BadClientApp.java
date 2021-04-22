package pattern.abstractfactory.test;

import pattern.abstractfactory.dao.DAO;
import pattern.abstractfactory.factory.DBDAOFactory;
import pattern.abstractfactory.factory.ExcelDAOFactory;

public class BadClientApp {

	public static void main(String[] args) {
		DAO studentDao = ExcelDAOFactory.createDAO("student");
		DAO courseDao = DBDAOFactory.createDAO("course");
		studentDao.insert();
		courseDao.insert();
	}

}
