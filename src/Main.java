
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Binusian student = new Student("BN001".toCharArray(), "bahrul");
		student.absent();

		Employee teacher = new Lecturer("BN002".toCharArray(), "budi");
		teacher.absent();
		teacher.getPaid();

	}

	public static void main(String[] args) {
		new Main();
	}
}
