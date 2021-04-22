package pattern.abstractfactory.test;

import pattern.abstractfactory.dao.DAO;
import pattern.abstractfactory.dao.DBDAOFactory;
import pattern.abstractfactory.dao.ExcelDAOFactory;

public class BadClientApp {

	public static void main(String[] args) {
		DAO studentDao = ExcelDAOFactory.createDAO("student");
		DAO courseDao = DBDAOFactory.createDAO("course");
		studentDao.insert();
		courseDao.insert();
	}

}
