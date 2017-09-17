package fxdi.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilMethods {
	public static Date stringToDateyyyyMMddHHmm(String strDate) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm"); 
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
}
