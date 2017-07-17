package pers.ljy.background.share.result;

/***
 * resultful API 代码值
 * @author ljy
 *
 */
public enum ApiResultCode {


	    SUCCESS("成功.", 0), FAIL("数据操作失败.", 1),ISEXTIS("数据值重复.",1001),PARAMS("参数错误.",1002),ERROR("程序运行中发生异常.",2);
    
	    private String msg ;
	    private int code ;
	     
	    private ApiResultCode( String msg , int code ){
	        this.msg = msg ;
	        this.code = code ;
	    }
	
		public String getMsg() {
			return msg;
		}
	
		public void setMsg(String msg) {
			this.msg = msg;
		}
	
		public int getCode() {
			return code;
		}
	
		public void setCode(int code) {
			this.code = code;
		}
	
}
