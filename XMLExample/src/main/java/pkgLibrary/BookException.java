package pkgLibrary;

public class BookException extends Exception {
	private int id;

	public BookException(int id) {
		this.id = id;
	}

	public int getId(){
		return id;
	}

}
