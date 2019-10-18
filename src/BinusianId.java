
public class BinusianId {

	private String id;
	private String nim;

	public BinusianId(String id, String nim) {
		super();
		this.id = id;
		this.nim = nim;
	}

	public BinusianId() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("NIM : %s, ID : %s", nim, id);
	}
}
