package cl.devster.starter.exceptions;

public class CustomException extends Exception {

	private static final long serialVersionUID = 6939878257846229095L;

	public CustomException(String message) {
		super(message);
	}

	public CustomException(Exception e) {
		super(e);
	}
}
