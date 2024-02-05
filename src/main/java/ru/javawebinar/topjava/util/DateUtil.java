package ru.javawebinar.topjava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm");

    public static String formatToString(LocalDateTime localDateTime) {
        return formatter.format(localDateTime);
    }

    public static LocalDateTime formatToDate(String strDateTime) throws ParseException {
        Date parse = formatter.parse(strDateTime);
        return LocalDateTime.of(parse.getDate(), parse.getMonth(), parse.getDay(), parse.getHours(), parse.getMinutes());
    }
}
