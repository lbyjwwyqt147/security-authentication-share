package pers.ljy.background.share.exception;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.ljy.background.share.result.ApiResultView;
import pers.ljy.background.share.result.BaseApiResultView;

/***
 * 异常统一处理
 * @author ljy
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	/**
	 * 创建异常处理(统一处理异常)
	 * @param ex
	 * @return
	 */
	@ExceptionHandler
	@ResponseBody
	public ApiResultView error(Exception ex){
		LOG.error(ex.getMessage(), ex);
		return new ApiResultView(BaseApiResultView.ERROR);
	}
	
	@ExceptionHandler
	@ResponseBody
	public ApiResultView businessExceptionHandler(BusinessException bex){
		LOG.error(bex.getMessage(), bex);
		if (null != bex.getErrorCode() && null != buildErrDataPacket(bex)) {
			return buildErrDataPacket(bex);
		}
		return new ApiResultView(BaseApiResultView.ERROR.getStatus(), bex.getMessage());
	}
	
	protected ApiResultView buildErrDataPacket(BusinessException bex) {
		return null;
	}
	
	@ExceptionHandler
	@ResponseBody
	public ApiResultView servletExceptionHandler(ServletException bex){
		LOG.error(bex.getMessage(), bex);
		return new ApiResultView(BaseApiResultView.ERROR.getStatus(), bex.getMessage());
	}
	
	
}
