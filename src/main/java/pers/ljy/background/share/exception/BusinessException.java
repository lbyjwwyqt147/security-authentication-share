package pers.ljy.background.share.exception;

/**
 * 全局异常处理
 * @author ljy
 *
 */
public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ErrorCode errorCode;
	
    public BusinessException(ErrorCode errorCode){
    	super(errorCode.getMessage());
    	this.errorCode = errorCode;
    }

	public BusinessException(String message){
		super(message);
	}
	
	public BusinessException(String message, Throwable cause){
		super(message, cause);
	}
	
	public ErrorCode getErrorCode() {
		return errorCode;
	}

}
