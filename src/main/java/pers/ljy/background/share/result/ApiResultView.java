package pers.ljy.background.share.result;


/**
 * resultful统一返回标准
 * @author ljy
 *
 */
public class ApiResultView extends BaseApiResultView {
	/* 数据值 */
	private Object data;
	
	public ApiResultView(){
		this(ApiResultCode.SUCCESS.getCode(), ApiResultCode.SUCCESS.getMsg());
	}
	
	public ApiResultView(Object data){
		this(ApiResultCode.SUCCESS.getCode(), ApiResultCode.SUCCESS.getMsg(),data);
	}
	
	
	public ApiResultView(BaseApiResultView result){
		this(result.getStatus(), result.getMsg(), null);
	}

	public ApiResultView(BaseApiResultView result, Object data){
		this(result.getStatus(), result.getMsg(), data);
    }
	
	public ApiResultView(int status, String msg){
		this(status, msg, null);
	}
	
	public ApiResultView(int status, String msg, Object data){
	    super(status, msg);
	    this.data = data;
    }

	public Object getData(){
		return data;
	}

	public void setData(Object data){
		this.data = data;
	}

}
