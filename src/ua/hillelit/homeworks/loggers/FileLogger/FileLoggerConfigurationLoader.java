package ua.hillelit.homeworks.loggers.FileLogger;

import java.io.*;

public class FileLoggerConfigurationLoader {

    public FileLoggerConfiguration load(String f) {
        try (FileReader reader = new FileReader(f);
             BufferedReader bf = new BufferedReader(reader)) {

            String fileName = bf.readLine();
            String loggingLevel = bf.readLine();
            long maxSize = Long.valueOf(bf.readLine());
            String format = bf.readLine();
            FileLoggerConfiguration fileLoggerConfiguration =
                    new FileLoggerConfiguration(fileName, loggingLevel, maxSize, format);
            System.out.println(fileLoggerConfiguration);
            return fileLoggerConfiguration;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
