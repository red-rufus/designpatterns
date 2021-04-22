package pattern.abstractfactory.factory;

import pattern.abstractfactory.dao.DAO;
import pattern.abstractfactory.dao.ExcelCourseDao;
import pattern.abstractfactory.dao.ExcelStudentDao;

public class ExcelDAOFactory implements DAOFactory{
	@Override
	public DAO createDAO(String type) {
		if(type.equalsIgnoreCase("student")) {
			return new ExcelStudentDao();
		} else if(type.equalsIgnoreCase("course")) {
			return new ExcelCourseDao();
		} else {
			throw new IllegalArgumentException("Invalid DAO Type");
		}
	}
}
