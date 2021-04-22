package pattern.abstractfactory.dao;

public class DBStudentDao implements DAO{

	@Override
	public void insert() {
		System.out.println("DBStudentDao inserting student into DB");
	}

}
