
public class Main {

	public Main() {
		// TODO Aut-generated constructor stub
		Binusian student = new Student("BN001", "bahrul");
		student.absent();

		Binusian teacher = new Lecturer("BN002", "budi");
		teacher.absent();

	}

	public static void main(String[] args) {
		new Main();
	}
}
