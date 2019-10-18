
public abstract class Binusian {

	private String id;
	private String nama;

	public Binusian(String id, String nama) {
		super();
		this.id = id;
		this.nama = nama;
	}

	abstract void absent();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

}
