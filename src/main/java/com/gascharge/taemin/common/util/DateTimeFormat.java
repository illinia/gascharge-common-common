package com.gascharge.taemin.common.util;

import java.time.format.DateTimeFormatter;
public class DateTimeFormat {
    private static final String FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final DateTimeFormatter formatter() {
        return DateTimeFormatter.ofPattern(FORMAT);
    }

    public static final DateTimeFormatter timeStampFormatter() {
        return DateTimeFormatter.ofPattern(TIMESTAMP_FORMAT);
    }
}
