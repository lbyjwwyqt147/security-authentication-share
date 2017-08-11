package pers.ljy.background.share.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @author ljy
 *
 */
public class SecurityReturnJson {

	    /**
		 * 将json输出到前端(参数非json格式)
		 * @param response
		 * @param obj  任意类型
		 */
		public static void writeJavaScript(HttpServletResponse response,Object obj){
		    response.setContentType("application/json;charset=UTF-8");
	        response.setHeader("Cache-Control","no-store, max-age=0, no-cache, must-revalidate");
	        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
	        response.setHeader("Pragma", "no-cache");
	        /* 设置浏览器跨域访问 */
	        response.setHeader("Access-Control-Allow-Origin", "*");
	        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE,PUT");
	        response.setHeader("Access-Control-Max-Age", "3600");
	        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
	        response.setHeader("Access-Control-Allow-Credentials","true");
			try {
		            PrintWriter out = response.getWriter();
		            out.write(JSON.toJSONString(obj));
		            out.flush();
		            out.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		}
}
