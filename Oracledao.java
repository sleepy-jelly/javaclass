package after1024;

public class Oracledao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Searching from Oracle DB");

	}

	@Override
	public void insert() {
		System.out.println("Inserting from Oracle DB");


	}

	@Override
	public void update() {
		System.out.println("Updating from Oracle DB");

	}

	@Override
	public void delete() {
		System.out.println("Deleting from Oracle DB");

	}

}
