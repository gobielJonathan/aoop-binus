
public class Lecturer extends Employee {

	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lecturer(BinusianId binusianId, String nama) {
		super(binusianId, nama);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPaid() {
		// TODO Auto-generated method stub

	}

	@Override
	void absent() {
		// TODO Auto-generated method stub
		System.out.println("lecturer with " + getBinusianId() + " was absent");
	}

}
