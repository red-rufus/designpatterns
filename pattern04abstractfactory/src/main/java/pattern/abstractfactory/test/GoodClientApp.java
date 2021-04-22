package pattern.abstractfactory.test;

import pattern.abstractfactory.dao.DAO;
import pattern.abstractfactory.dao.ExcelDAOFactory;

public class GoodClientApp {

	public static void main(String[] args) {
		DAO studentDao = ExcelDAOFactory.createDAO("student");
		DAO courseDao = ExcelDAOFactory.createDAO("course");
		studentDao.insert();
		courseDao.insert();
	}

}
