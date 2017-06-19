package pers.ljy.background.share.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.dozer.DozerBeanMapper;

/***
 * 文件名称: DozerMapper.java
 * 文件描述: DozerBeanMapper 对象深度复制
 * 公 司: 
 * 内容摘要: 
 * 其他说明:
 * 完成日期:2017年06月19日 
 * 修改记录:
 * @version 1.0
 * @author ljy
 */
public class DozerMapper {
	 private static DozerBeanMapper dozer = new DozerBeanMapper();  
	  
	 /** 
	  * 构造新的destinationClass实例对象，通过source对象中的字段内容 
	  * 映射到destinationClass实例对象中，并返回新的destinationClass实例对象。 
	  *  
	  * @param source 源数据对象 
	  * @param destinationClass 要构造新的实例对象Class 
	  */  
	  public static <T> T map(Object source, Class<T> destinationClass){  
	      return dozer.map(source, destinationClass);  
	  }  
	    
	    
	  /**
	   * 构造新的destinationClass实例对象集合，通过source对象中的字段内容 
	   * 映射到destinationClass实例对象中，并返回新的destinationClass实例对象集合。 
	   * @param sourceList  源数据对象
	   * @param destinationClass 要构造新的实例对象Class
	   * @return
	   */
	  public static <T> CopyOnWriteArrayList<T> mapList(Collection<?> sourceList, Class<T> destinationClass)  {  
		  CopyOnWriteArrayList<T> destinationList = new CopyOnWriteArrayList<>();  
		  for (Iterator<?> i$ = sourceList.iterator(); i$.hasNext(); ){
			  Object sourceObject = i$.next();  
		      T destinationObject = dozer.map(sourceObject, destinationClass);  
		      destinationList.add(destinationObject);  
		  }  
	      return destinationList;  
	  }  
	  
	    
	 /** 
	  * 将对象source的所有属性值拷贝到对象destination中. 
	  *  
	  * @param source 对象source 
	  * @param destination 对象destination 
	  */  
	  public static void copy(Object source, Object destinationObject){  
	     dozer.map(source, destinationObject);  
	  }  
	  
	  /** 
	   * 将对象source的所有属性值转为Map. 
	   *  
	   * @param source 对象source 
	   */ 
	  public static <T> Map<String, T> toMap(Object target) {  
		    return toMap(target,false);  
	  }  
		  
	 /** 
	  * 将目标对象的所有属性转换成Map对象 
	  *  
	  * @param target 目标对象 
	  * @param ignoreParent 是否忽略父类的属性 
	  *  
	  * @return Map 
	  */  
	  public static <T> Map<String, T> toMap(Object target,boolean ignoreParent) {  
	     return toMap(target,ignoreParent,false);  
	  }  
		  
	   /** 
		 * 将目标对象的所有属性转换成Map对象 
		 *  
		 * @param target 目标对象 
		 * @param ignoreParent 是否忽略父类的属性 
		 * @param ignoreEmptyValue 是否不把空值添加到Map中 
		 *  
		 * @return Map 
		 */  
		public static <T> Map<String, T> toMap(Object target,boolean ignoreParent,boolean ignoreEmptyValue) {  
		    return toMap(target,ignoreParent,ignoreEmptyValue,new String[0]);  
		}  
		  
		/** 
		 * 将目标对象的所有属性转换成Map对象 
		 *  
		 * @param target 目标对象 
		 * @param ignoreParent 是否忽略父类的属性 
		 * @param ignoreEmptyValue 是否不把空值添加到Map中 
		 * @param ignoreProperties 不需要添加到Map的属性名 
		 */  
		   public static <T> Map<String, T> toMap(Object target,boolean ignoreParent,boolean ignoreEmptyValue,String... ignoreProperties) {  
		        Map<String, T> map = new HashMap<String, T>();  
		          
			   /* List<Field> fields = ReflectionUtils.getAccessibleFields(target.getClass(), ignoreParent);  
			      
			    for (Iterator<Field> it = fields.iterator(); it.hasNext();) {  
			        Field field = it.next();  
			        T value = null;  
			          
			        try {  
			            value = (T) field.get(target);  
			        } catch (Exception e) {  
			            e.printStackTrace();  
			        }  
			          
			        if (ignoreEmptyValue  
			                && ((value == null || value.toString().equals(""))  
			                || (value instanceof Collection && ((Collection<?>) value).isEmpty())  
			                || (value instanceof Map && ((Map<?,?>)value).isEmpty()))) {  
			            continue;  
			        }  
			          
			        boolean flag = true;  
			        String key = field.getName();  
			          
			        for (String ignoreProperty:ignoreProperties) {  
			            if (key.equals(ignoreProperty)) {  
			                flag = false;  
			                break;  
			            }  
			        }  
			          
			        if (flag) {  
			            map.put(key, value);  
			        }  
			    }  */
			      
			   return map;  
		    }  
}
