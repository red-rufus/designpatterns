package pattern.abstractfactory.dao;

public class ExcelStudentDao implements DAO{

	@Override
	public void insert() {
		System.out.println("StudentCourseDao inserting student into Excel");
	}

}
