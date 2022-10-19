package Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {

    static SimpleDateFormat formater = new SimpleDateFormat();
    
    /*
    Exam:
        String s = "01-09-1971";
        Date date = XDate.toDate(s, "dd-MM-yyyy");
        System.out.println(date);
    */
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
            
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    /*
    Exam:
        Date now = new Date();
        String s = XDate.toString(now, "yyyy-MM-dd");
        System.out.println(s);
    */
    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }

    /*
    Exam:
        Date now = new Date();
        Date after = XDate.addDays(now, 5);
        System.out.println(after);
    */
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
}
