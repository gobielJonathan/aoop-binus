
public class Lecturer extends Employee {

	public Lecturer(String id, String nama) {
		super(id, nama);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPaid() {
		// TODO Auto-generated method stub

	}

	@Override
	void absent() {
		// TODO Auto-generated method stub
		System.out.println("lecturer with " + getId() + " was absent");
	}

}
