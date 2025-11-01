package com.homework;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {

    public static byte[] streamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = is.read(buf)) != -1) {
            byteArrayOutputStream.write(buf, 0, len);
        }
        byte[] array = byteArrayOutputStream.toByteArray();
        return array;
    }
}
