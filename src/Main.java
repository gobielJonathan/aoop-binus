
public class Main {

	public Main() {
		// TODO Aut-generated constructor stub
		BinusianId binusianId = new BinusianId("BN0111","201631513" );
		
		Binusian student = new Student(binusianId, "bahrul");
		
		student.absent();

		binusianId = new BinusianId("BN002", "-");
		
		Employee teacher = new Lecturer(binusianId, "budi");
		teacher.absent();
		teacher.getPaid();

	}

	public static void main(String[] args) {
		new Main();
	}
}
