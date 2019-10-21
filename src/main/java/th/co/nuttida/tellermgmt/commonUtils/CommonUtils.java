package th.co.nuttida.tellermgmt.commonUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CommonUtils {
	public final String dtFormatDDMMYYYY = "dd/MM/yyyy";
	public final String dtFormatDDMMYYYY2 = "dd-MM-yyyy";
	public final String dtFormatyyyyMMdd = "yyyy-MM-dd";

	public String convertDateFormat1(Date date) {
		String dateStr = "";
		Locale locale = new Locale("th", "TH");
		dateStr = new SimpleDateFormat("MM/dd/yyyy").format(date);
		DateFormat datef = new SimpleDateFormat("MM/dd/yyyy", locale);
		dateStr = datef.toString();
		return dateStr;

	}

	public String convertDateFormat(Date sdate) throws java.text.ParseException {
		try {
			Locale locale = new Locale("th", "TH");
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
			Date date = (Date) formatter.parse(sdate.toString());
			Calendar cal = Calendar.getInstance();
			DateFormat datef = new SimpleDateFormat("dd/MM/yyyy", locale);
			cal.setTime(date);
			return datef.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public String cvDateFormatCustom(Date sdate, String format) throws java.text.ParseException {
		try {
			Locale locale = new Locale("th", "TH");
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
			Date date = (Date) formatter.parse(sdate.toString());
			Calendar cal = Calendar.getInstance();
			DateFormat datef = new SimpleDateFormat(format, locale);
			cal.setTime(date);
			return datef.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public String convertDateTimeFormat(Date sdate) throws java.text.ParseException {
		Locale locale = new Locale("th", "TH");
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.US);
		Date date = (Date) formatter.parse(sdate.toString());
		Calendar cal = Calendar.getInstance();
		DateFormat datef = new SimpleDateFormat("dd/MM/yyyy", locale);
		cal.setTime(date);
		return datef.format(date);
	}

	public String convertDateFormatFromTh(Date sdate) throws java.text.ParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
		Date date = (Date) formatter.parse(sdate.toString());
		Calendar cal = Calendar.getInstance();
		DateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
		cal.setTime(date);
		return datef.format(date);
	}

	public String convertDateRPT(Date cDate) throws ParseException {
		Locale locale = new Locale("th", "TH");
		String dateStr = new SimpleDateFormat("MM/dd/yyyy").format(cDate);
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
		Date dateReport = (Date) formatter.parse(dateStr);
		Calendar cal = Calendar.getInstance();
		DateFormat datef = new SimpleDateFormat("dd/MM/yyyy", locale);
		cal.setTime(dateReport);
		return datef.format(dateReport);

	}

	public Date getlastDayOfMonth(Date day) {
		Calendar c = Calendar.getInstance();
		c.setTime(day);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return c.getTime();
	}

	public String getTodayDate(String format) {
		Locale locale = new Locale("th", "TH");
		Calendar cal = Calendar.getInstance();
		DateFormat datef = new SimpleDateFormat(format, locale);
		return datef.format(cal.getTime());
	}

	public String getFormatReportId(String reportID) {
		String reportIDFormat = "";
		reportIDFormat = reportID.substring(0, 3) + '-' + reportID.substring(3, 8) + '-' + reportID.substring(8, 10)
				+ '-' + reportID.substring(10, 14) + '-' + reportID.substring(14, 18);
		return reportIDFormat;
	}

	public String getTodayDatetime() {
		Locale locale = new Locale("th", "TH");
		Calendar cal = Calendar.getInstance();
		DateFormat datef = new SimpleDateFormat("ddMMyyyyHHmmssSSS", locale);
		return datef.format(cal.getTime());
	}

	public Date convertStringToDate(String dateStr) throws java.text.ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate;
		startDate = df.parse(dateStr);
		return startDate;
	}

	public Date getCurrentDate() throws java.text.ParseException {
		Date startDate;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		startDate = df.parse(dateFormat.format(date));
		return startDate;
	}

	public Date getCurrentDateTime() throws java.text.ParseException {
		Date startDate;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		startDate = df.parse(dateFormat.format(date));
		return startDate;
	}

	public String getDateForFixLength() {
		Locale locale = new Locale("th", "TH");
		Calendar cal = Calendar.getInstance();
		DateFormat datef = new SimpleDateFormat("YYMMdd", locale);
		return datef.format(cal.getTime());
	}

	public Date dateFromTime(Date date) {
		Calendar cal = Calendar.getInstance(); // locale-specific
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 00);
		cal.set(Calendar.MINUTE, 00);
		cal.set(Calendar.SECOND, 00);
		return cal.getTime();
	}

	public Date dateToTime(Date date) {
		Calendar cal = Calendar.getInstance(); // locale-specific
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return cal.getTime();
	}

	public String getStringDate(Date startDate) {
		String strDate = "";
		return strDate;
	}

	public Date getReportDate(String reportDate) throws ParseException {

		Locale locale = new Locale("th", "TH");
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("yyMMdd", locale);
		Date startDate;
		startDate = df.parse(reportDate);
		return startDate;
	}

	public String getMonthThaiFormat(Date date) {
		String fullDate = getFullDateThaiFormat(date);
		String month = null;
		if (fullDate != null) {
			month = fullDate.split(" ", 3)[1];
		}
		return month;
	}

	public String getYearThaiFormat(Date date) {
		String fullDate = getFullDateThaiFormat(date);
		String month = null;
		if (fullDate != null) {
			month = fullDate.split(" ", 3)[2];
		}
		return month;
	}

	public String getFullDateThaiFormat(Date date) {
		try {
			String Months[] = { "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม",
					"กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" };
			int year = 0, month = 0, day = 0;
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			year = c.get(Calendar.YEAR);
			month = c.get(Calendar.MONTH);
			day = c.get(Calendar.DATE);
			return String.format("%s %s %s", day, Months[month], year + 543);
		} catch (Exception e) {
			return null;
		}
	}

}
