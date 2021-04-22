package pattern.abstractfactory.dao;

public class DBCourseDao implements DAO{

	@Override
	public void insert() {
		System.out.println("DBCourseDao inserting course into DB");
	}

}
