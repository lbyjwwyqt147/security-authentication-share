package pers.ljy.background.share.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * 文件名称: DateUtils.java
 * 文件描述: 日期时间格式工具类
 * 公 司: 
 * 内容摘要: 
 * 其他说明:
 * 完成日期:2017年04月24日 
 * 修改记录:
 * @version 1.0
 * @author liujunyi
 */
public final class DateUtils {

	public final static String YYYY_MM_DD_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
	public final static String YYYY_MM_DD_HH_mm_ss_SSS = "yyyy-MM-dd HH:mm:ss SSS";
	public final static String YYYY_MM_DD = "yyyy-MM-dd";
	public final static String YYYY_MM_DD_ZN_CH = "yyyy年MM月dd日";
	private final static Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);

	/**
	 * 获取当前时间戳
	 * @return
	 */
	public static long getServerTime() {
		return System.currentTimeMillis();
	}

	/**
	 * 格式化日期,返回yyyy-MM-dd HH:mm:ss.
	 * @param date  日期时间
	 * @return 返回：日期字符串 yyyy-MM-dd HH:mm:ss
	 */
	public static String format(Date date) {
		return format(date, DateUtils.YYYY_MM_DD_HH_mm_ss);
	}

	/**
	 * 格式化显示当前日期.
	 * @param format  格式
	 * @return 返回当前日期格式后的字符串
	 */
	public static String format(String format) {
		return format(new Date(), format);
	}

	/**
	 * 日期格式化.
	 * @param date   时间日期
	 * @param format 格式
	 * @return 返回指定日期格式化后的字符串
	 */
	public static String format(Date date, String format) {
		if (date == null)
			return null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		} catch (Exception e) {
			LOGGER.warn("日期格式化失败.{}", e.getMessage());
		}
		return null;
	}

	/**
	 * 时间格式化， 传入毫秒.
	 * @param time  时间戳
	 * @return 返回时间戳格式后的日期字符串 yyyy-MM-dd HH:mm:ss
	 */
	public static String dateFormat(long time) {
		return format(new Date(time), DateUtils.YYYY_MM_DD_HH_mm_ss);
	}

	/**
	 * 日期字符串从旧格式转换为新格式.
	 * 
	 * @param dateStr
	 *            the date str
	 * @param oldFromat
	 *            the old fromat
	 * @param newFormat
	 *            the new format
	 * @return the string
	 */
	public static String format(String dateStr, String oldFromat, String newFormat) {
		try {
			if (dateStr == null || "".equals(dateStr)) {
				return null;
			}

			SimpleDateFormat sdf1 = new SimpleDateFormat(oldFromat);
			Date date = sdf1.parse(dateStr);

			return format(date, newFormat);

		} catch (Exception e) {
			LOGGER.warn("日期格式化转换失败.{}", e.getMessage());
		}
		return null;
	}

	/**
	 * 日期字符串转换为Calendar对象.
	 * @param dateStr  日期字符串
	 * @param dateStrFormat 格式化格式
	 * @return 返回日期字符串转为的Calendar对象
	 */
	public static Calendar format(String dateStr, String dateStrFormat) {
		try {
			if (dateStr == null || "".equals(dateStr)) {
				return null;
			}
			SimpleDateFormat sdf = new SimpleDateFormat(dateStrFormat);
			Date date = sdf.parse(dateStr);
			Calendar ca = GregorianCalendar.getInstance();
			ca.setTime(date);
			return ca;
		} catch (Exception e) {
			LOGGER.warn("日期格式化转换失败.{}", e.getMessage());
		}
		return null;
	}
	
	/**
	 * 日期转换为Calendar对象.
	 * 
	 * @param date  日期时间
	 * @return 日期转换为的Calendar对象
	 */
	public static Calendar formatCalendar(Date date) {
		try {
			if (date == null) {
				return null;
			}
			Calendar ca = GregorianCalendar.getInstance();
			ca.setTime(date);
			return ca;
		} catch (Exception e) {
			LOGGER.warn("日期格式化转换失败.{}", e.getMessage());
		}
		return null;
	}

	/**
	 * 日期字符串转换为Date对象.
	 * 
	 * @param dateStr 日期时间字符串
	 * @param dateStrFormat  格式
	 * @return 返回将日期字符串转换为date对象
	 */
	public static Date dateStr2Date(String dateStr, String dateStrFormat) {
		try {
			if (dateStr == null || "".equals(dateStr)) {
				return null;
			}
			SimpleDateFormat sdf = new SimpleDateFormat(dateStrFormat);
			return sdf.parse(dateStr);
		} catch (Exception e) {
			LOGGER.warn("日期格式化转换失败.{}", e.getMessage());
		}
		return null;
	}

	/**
	 * 增加日期的小时.
	 * 
	 * @param date  日期时间
	 * @param amount 小时参数
	 * @return 返回：增加小时后的日期
	 */
	public static Date addDays(Date date, int amount) {
		return add(date, Calendar.DAY_OF_MONTH, amount);
	}

	/**
	 * 增加日期的天数
	 * 
	 * @param date  日期时间
	 * @param amount 天数参数
	 * @return 返回：增加天数后的日期
	 */
	public static Date addHours(Date date, int amount) {
		return add(date, Calendar.HOUR_OF_DAY, amount);
	}

	/**
	 * 增加日期的秒数.
	 * 
	 * @param date  日期时间
	 * @param amount 秒数参数
	 * @return 返回：增加秒数后的日期
	 */
	public static Date addSeconds(Date date, int amount) {
		return add(date, Calendar.SECOND, amount);
	}

	/**
	 * Adds the.
	 * 
	 * @param date
	 *            the date
	 * @param field
	 *            the field
	 * @param amount
	 *            the amount
	 * @return the date
	 */
	private static Date add(Date date, int field, int amount) {

		if (null == date) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(field, amount);
		return cal.getTime();

	}

	/**
	 * 格式化日期字符串为日期时间字符串，以0点0时0分开始。例如：2017-04-24 格式化为2017-04-24 00:00:00
	 * 
	 * @param dateStr 日期字符串
	 * @return 返回字符串格式为：格式化为2017-04-24 00:00:00
	 */
	public static String formatDate2DateTimeStart(String dateStr) {
		Calendar calendar = DateUtils.format(dateStr, DateUtils.YYYY_MM_DD);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return format(calendar.getTime());
	}

	/**
	 * 格式化日期字符串为日期时间字符串，以23点59时59分结束。例如：2017-04-24 格式化为2017-04-24 23:59:59
	 * 
	 * @param dateStr  日期字符串
	 * @return 返回字符串格式为：2017-04-24 23:59:59
	 */
	public static String formatDate2DateTimeEnd(String dateStr) {
		Calendar calendar = DateUtils.format(dateStr, DateUtils.YYYY_MM_DD);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return format(calendar.getTime());
	}

	/**
	 * 格式化日期字符串为日期时间字符串，以0点0时0分开始。例如：2017-04-24 格式化为2017-04-24 00:00:00
	 * 
	 * @param date  日期时间
	 * @return 返回日期：2017-04-24 00:00:00
	 */
	public static Date formatDate2DateTimeStart(Date date) {
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 格式化日期字符串为日期时间字符串，以23点59时59分结束。例如：2017-04-24 格式化为2017-04-24 23:59:59
	 * @param date 日期时间
	 * @return 返回日期：2017-04-24 23:59:59
	 */
	public static Date formatDate2DateTimeEnd(Date date) {
		if (date == null) {
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}

	public static boolean isEarlyThan(Date d1, Date d2) {
		if (d1 != null && d2 != null) {
			Calendar c1 = Calendar.getInstance();
			c1.setTime(d1);

			Calendar c2 = Calendar.getInstance();
			c2.setTime(d2);

			return c1.before(c2);
		}
		return false;
	}

	/**
	 * 日期格式化 返回格式 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static Date formatDateStr2Date(String date) {
		return DateUtils.dateStr2Date(date, DateUtils.YYYY_MM_DD_HH_mm_ss);
	}

	/**
	 * 获取当前时间
	 * @return  返回：2017-04-24 23:59:59
	 */
	public static Date getCurrentDate() {
		return new Date();
	}
	
	/**
	 * 获取当前日期
	 * @return 返回：2017-04-24
	 */
	public static String getTodayStr() {
		return format(new Date(), YYYY_MM_DD);
	}

	public static Date getTodayMinTime() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 1);
		return c.getTime();
	}

	public static Date getTodayMaxTime() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		return c.getTime();
	}
	
   /** 
     * 两个时间相差距离多少天多少小时多少分多少秒 
     * @param startTime 时间参数 1 格式：最大时间戳
     * @param endTime 时间参数 2 格式：最小时间戳 
     * @return String 返回值为：xx天xx小时xx分xx秒 
     */  
    public static String getDistanceTime(Long startTime, Long endTime) {  
        long day = 0;  
        long hour = 0;  
        long min = 0;  
        long sec = 0;  
        long diff ;  
		if(startTime < endTime) {  
		    diff = endTime - startTime;  
		} else {  
		    diff = startTime - endTime;  
		}  
		day = diff / (24 * 60 * 60 * 1000);  
		hour = (diff / (60 * 60 * 1000) - day * 24);  
		min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);  
		sec = (diff/1000-day*24*60*60-hour*60*60-min*60);  
        return day + "天" + hour + "小时" + min + "分" + sec + "秒";  
    } 
	
    /** 
     * 两个时间相差距离多少秒 
     * @param startTime 时间参数 1 格式：最大时间戳
     * @param endTime 时间参数 2 格式：最小时间戳 
     * @return String 返回值为：2个时间相差的秒数 
     */  
    public static Long getDistanceSeconds(Long startTime, Long endTime) {   
        long sec = 0;  
        long diff ;  
		if(startTime < endTime) {  
		    diff = endTime - startTime;  
		} else {  
		    diff = startTime - endTime;  
		}  
		sec = diff/1000;
        return sec;  
    } 
}
