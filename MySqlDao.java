package after1024;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Searching from MySql DB");

	}

	@Override
	public void insert() {
		System.out.println("Inserting from MySql DB");

	}

	@Override
	public void update() {
		System.out.println("Updating from MySql DB");

	}

	@Override
	public void delete() {
		System.out.println("Deleting from MySql DB");

	}

}
