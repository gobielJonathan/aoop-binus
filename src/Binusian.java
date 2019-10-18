
public abstract class Binusian {

	private char[] id;
	private String nama;

	public Binusian(char[] id, String nama) {
		super();
		this.id = id;
		this.nama = nama;
	}

	public Binusian() {
		// TODO Auto-generated constructor stub
	}

	abstract void absent();

	public char[] getId() {
		return id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

}
