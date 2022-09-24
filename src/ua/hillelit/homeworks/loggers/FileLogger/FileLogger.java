package ua.hillelit.homeworks.loggers.FileLogger;

import ua.hillelit.homeworks.exceptions.FileMaxSizeReachedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FileLogger {
    public static void info(String message, FileLoggerConfiguration config) {
        fileSizeValidator(config);
        doLogg(config, message, LoggingLevel.INFO);
    }

    public static void debug(String message, FileLoggerConfiguration config) {
        fileSizeValidator(config);

        doLogg(config, message, LoggingLevel.DEBUG);
        info(message, config);
    }

    public static void doLogg(FileLoggerConfiguration config, String message, LoggingLevel ll) {
        try {
            FileOutputStream os = new FileOutputStream(config.getFile(), true);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            os.write(config.getFormat().format("%1$s %2$s Сообщение : %3$s\n", ZonedDateTime.now().
                    format(formatter), ll, message).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileSizeValidator(FileLoggerConfiguration config) {
        if(config.getMaxFileSize() <= config.getFile().length()) {
            throw new FileMaxSizeReachedException("Файл переполнен!", config.getMaxFileSize(),
                    config.getFile().length(), config.getFile().getPath());
        }
    }
}
