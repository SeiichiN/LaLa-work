package chap17.nuk;

public class MyApplicationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MyApplicationException(String msg) {
		super(msg);
	}
}
