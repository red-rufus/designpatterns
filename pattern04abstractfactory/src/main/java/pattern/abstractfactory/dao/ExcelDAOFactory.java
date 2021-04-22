package pattern.abstractfactory.dao;

public class ExcelDAOFactory {
	public static DAO createDAO(String type) {
		if(type.equalsIgnoreCase("student")) {
			return new ExcelStudentDao();
		} else if(type.equalsIgnoreCase("course")) {
			return new ExcelCourseDao();
		} else {
			throw new IllegalArgumentException("Invalid DAO Type");
		}
	}
}
