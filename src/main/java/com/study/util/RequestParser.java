package com.study.util;

import com.study.entity.HttpMethod;
import com.study.entity.HttpStatus;
import com.study.entity.Request;
import com.study.exception.ServerException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class RequestParser {

    public static Request parseRequest(BufferedReader reader) {
        try {
            String line = reader.readLine();
            Request request = new Request();
            injectUriAndMethod(request, line);
            injectHeaders(request, reader);
            return request;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new ServerException(HttpStatus.METHOD_NOT_ALLOWED);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServerException(HttpStatus.BAD_REQUEST);
        }

    }

    static void injectUriAndMethod(Request request, String requestLine) {
    }

    static void injectHeaders(Request request, BufferedReader reader) throws IOException {
    }
}
