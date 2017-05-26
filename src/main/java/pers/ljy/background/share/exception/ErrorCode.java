package pers.ljy.background.share.exception;

/**
 * 异常代码
 * @author ljy
 *
 */
public interface ErrorCode {
    /**
     * 异常代码
     * @return
     */
	String getCode();
    /**
     * 异常消息
     * @return
     */
    String getMessage();
    /**
     * 异常出现的url
     * @return
     */
    String getUrl();
}
