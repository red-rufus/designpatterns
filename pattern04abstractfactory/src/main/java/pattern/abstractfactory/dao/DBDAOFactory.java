package pattern.abstractfactory.dao;

public class DBDAOFactory {
	public static DAO createDAO(String type) {
		if(type.equalsIgnoreCase("student")) {
			return new DBStudentDao();
		} else if(type.equalsIgnoreCase("course")) {
			return new DBCourseDao();
		} else {
			throw new IllegalArgumentException("Invalid DAO Type");
		}
	}
}
