package com.example.JavaEE8GetStarter.factories;

import com.example.JavaEE8GetStarter.loggers.TimeLogger;

import javax.enterprise.inject.Produces;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeLoggerFactory {
    @Produces
    public TimeLogger getTimerLogger() {
        return new TimeLogger(new SimpleDateFormat("HH:mm"), Calendar.getInstance());
    }
}
