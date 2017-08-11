package pers.ljy.background.share.result;

/**
 * 定义 resultful  
 * @author ljy
 *
 */
public  class BaseApiResultView {
	public static final BaseApiResultView SUCCESS = new BaseApiResultView(0, "成功.");
	public static final BaseApiResultView FAIL = new BaseApiResultView(1, "数据操作失败.");
	public static final BaseApiResultView ERROR = new BaseApiResultView(2, "程序运行中发生异常.");
	public static final BaseApiResultView AUTHENTICATIONFALL = new BaseApiResultView(10, "无权限访问.");
    /* 代码 */
	private int status;
	/* 消息 */
	private String msg;
	
	public BaseApiResultView(){
		
	}
	
	public BaseApiResultView(int status, String msg){
	    this.status = status;
	    this.msg = msg;
    }

	public int getStatus(){
		return status;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public String getMsg(){
		return msg;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}
}
