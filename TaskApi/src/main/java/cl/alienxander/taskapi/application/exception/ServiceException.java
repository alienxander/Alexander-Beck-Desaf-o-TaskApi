package cl.alienxander.taskapi.application.exception;

public class ServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3255573198414469051L;

	public ServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return super.getLocalizedMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

	@Override
	public void setStackTrace(StackTraceElement[] stackTrace) {
		// TODO Auto-generated method stub
		super.setStackTrace(stackTrace);
	}
}
