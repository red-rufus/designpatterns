package pattern.abstractfactory.dao;

public class ExcelCourseDao implements DAO{

	@Override
	public void insert() {
		System.out.println("ExcelCourseDao inserting course into Excel");
	}

}
