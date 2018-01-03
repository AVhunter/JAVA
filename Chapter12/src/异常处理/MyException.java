package 异常处理;

public class MyException extends Exception {
	String message;
	public MyException(String ErrorMessage) {
		message = ErrorMessage;
	}
	public String getMessage() {
		return message;
	}
}
