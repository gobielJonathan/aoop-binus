
public abstract class Binusian {

	private BinusianId binusianId;
	private String nama;

	public Binusian(BinusianId binusianId, String nama) {
		super();
		this.binusianId = binusianId;
		this.nama = nama;
	}

	public BinusianId getBinusianId() {
		return binusianId;
	}

	public Binusian() {
		// TODO Auto-generated constructor stub
	}

	abstract void absent();

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

}
