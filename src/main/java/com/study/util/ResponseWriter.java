package com.study.util;

import com.study.entity.HttpStatus;

import java.io.*;

public class ResponseWriter {
    private BufferedOutputStream writer;

    public ResponseWriter(BufferedOutputStream writer) {
        this.writer = writer;
    }

    public void writeResponse(HttpStatus httpStatus, String body) {

    }


}
