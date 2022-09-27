package ua.hillelit.homeworks.loggers.FileLogger;

import java.io.File;

public class FileLoggerConfiguration {
    private String fileName;
    private String loggingLevel;
    private long maxFileSize;
    private String format;


    public FileLoggerConfiguration(String fileName, String loggingLevel, long maxFileSize, String format) {
        this.fileName = fileName;
        this.loggingLevel = loggingLevel;
        this.maxFileSize = maxFileSize;
        this.format = format;
    }

    @Override
    public String toString() {
        return "FileLoggerConfiguration{" +
                "fileName='" + fileName + '\'' +
                ", loggingLevel='" + loggingLevel + '\'' +
                ", maxFileSize=" + maxFileSize +
                ", format='" + format + '\'' +
                '}';
    }

    public String getFileName() {
        return fileName;
    }

    public String getLoggingLevel() {
        return loggingLevel;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public String getFormat() {
        return format;
    }
}