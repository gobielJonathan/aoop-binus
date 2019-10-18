
public class Student extends Binusian {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(BinusianId binusianId, String nama) {
		super(binusianId, nama);
		// TODO Auto-generated constructor stub
	}

	@Override
	void absent() {
		// TODO Auto-generated method stub
		System.out.println("Student with binusian number " + getBinusianId()+ " already absent");
	}

}
