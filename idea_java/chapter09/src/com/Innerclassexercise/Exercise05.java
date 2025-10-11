package com.Innerclassexercise;

public class Exercise05 {
    public static void main(String[] args) {
        FileDownloader fileDownloader = new FileDownloader();
        fileDownloader.download("sdafaf", fileDownloader.getDownloadThread());
    }
}
interface DownloadListener {
    void onComplete(String file);
    void onError(String errorMsg);
}
class FileDownloader {
    public void download(String url , DownloadListener listener) {
        if(url == null || url.length() == 0) {
            listener.onError("url is null or empty");
            return;
        }
        listener.onComplete(url);
    }
    class DownloadThread implements DownloadListener {
        public void onComplete(String file) {
            System.out.println(file);
        }
        public void onError(String errorMsg) {
            System.out.println(errorMsg);
        }
    }

    public DownloadThread getDownloadThread() {
        return new DownloadThread();
    }
}
