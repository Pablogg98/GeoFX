package dad.javafx.geofx.client;

@SuppressWarnings("serial")
public class IpApiServiceException extends Exception {

	public IpApiServiceException() {
	}

	public IpApiServiceException(String message) {
		super(message);
	}

	public IpApiServiceException(Throwable cause) {
		super(cause);
	}

	public IpApiServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public IpApiServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
