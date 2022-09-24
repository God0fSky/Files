package ua.hillelit.homeworks.loggers.FileLogger;

import java.io.File;

public class FileLoggerConfiguration {
    private File file;
    private LoggingLevel loggingLevel;
    private long maxFileSize;
    private String format;


    public FileLoggerConfiguration(File file, long maxFileSize) {

        this.file = file;
        this.maxFileSize = maxFileSize;

    }

    public File getFile() {
        return file;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public String getFormat() {
        return format;
    }
}