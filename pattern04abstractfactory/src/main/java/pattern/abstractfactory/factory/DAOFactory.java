package pattern.abstractfactory.factory;

import pattern.abstractfactory.dao.DAO;

public interface DAOFactory {
	public DAO createDAO(String type);
}
