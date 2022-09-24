package ua.hillelit.homeworks.exceptions;

public class FileMaxSizeReachedException extends RuntimeException{

    private long maxSize;
    private long currentSize;
    private String filePath;
    public FileMaxSizeReachedException(String message, long maxSize, long curentSize, String filePath) {
        super(message);
        this.maxSize = maxSize;
        this.currentSize = curentSize;
        this.filePath = filePath;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public long getCurrentSize() {
        return currentSize;
    }

    public String getFilePath() {
        return filePath;
    }
}
