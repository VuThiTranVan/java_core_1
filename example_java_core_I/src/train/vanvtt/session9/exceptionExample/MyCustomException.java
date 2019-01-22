package train.vanvtt.session9.exceptionExample;

public class MyCustomException extends Exception {

	private static final long serialVersionUID = 7718828512143293558L;

	public MyCustomException() {
		super();
	}

	public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyCustomException(String message) {
		super(message);
	}

	public MyCustomException(Throwable cause) {
		super(cause);
	}
}