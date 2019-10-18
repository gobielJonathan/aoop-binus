
public class Student extends Binusian {

	
	public Student(String id, String nama) {
		super(id, nama);
		// TODO Auto-generated constructor stub
	}

	@Override
	void absent() {
		// TODO Auto-generated method stub
		System.out.println("Student with binusian number " + getId() + " already absent");
	}

}
