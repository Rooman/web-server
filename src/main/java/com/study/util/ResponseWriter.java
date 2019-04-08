package com.study.util;

import com.study.entity.HttpStatus;

import java.io.*;

public class ResponseWriter {
    private BufferedOutputStream writer;

    public ResponseWriter(BufferedOutputStream writer) {
        this.writer = writer;
    }

    public void writeResponse(HttpStatus httpStatus, String body) {
        byte[] buffer = new byte[8192];
        try {
            writer.write(httpStatus.getStatusLine().getBytes());
            writer.write("\n".getBytes());
            writer.write("\n".getBytes());
            if (body != null) {
                writer.write(body.getBytes());
            }
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
