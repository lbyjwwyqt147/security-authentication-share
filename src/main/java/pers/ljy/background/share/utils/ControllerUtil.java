package pers.ljy.background.share.utils;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControllerUtil {
	private static Logger log = LoggerFactory.getLogger(ControllerUtil.class);
	@SuppressWarnings("rawtypes")
	public static ConcurrentMap<String,Object> getFormData(HttpServletRequest request){
		   ConcurrentMap<String,Object> map = new ConcurrentHashMap<String,Object>();
	 		try {
	 			Enumeration en = request.getParameterNames();
	 	 		while(en.hasMoreElements()){
	 	 			String name=(String)en.nextElement();
	 	 			String [] values= request.getParameterValues(name);
	 	 			if(!name.contains("[]")){
	 	 				if(!values[0].equals(""))
	 	 					map.put(name, values[0]);
	 	 			}else {
	 	 				map.put(name.replace("[]", ""), values);
	 	 			}
	 	 		}
			} catch (Exception e) {
				e.printStackTrace();
				log.error("获取客户端向后台传入的参数出现异常.");
			}
	 		return map;
	 	}
}
