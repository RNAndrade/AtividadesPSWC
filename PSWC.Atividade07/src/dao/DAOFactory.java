package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {

	private static final EntityManagerFactory factory;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		factory = Persistence.createEntityManagerFactory("unit");
	}

	public static EntityManagerFactory getInstance() {
		return factory;
	}
}
