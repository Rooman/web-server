package com.study.io;

import com.study.entity.HttpStatus;
import com.study.exception.ServerException;

import java.io.*;

public class ResourceReader {

    public static String readContent(String webAppPath, String uri) {

        File file = new File(webAppPath, uri);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
            throw new ServerException(HttpStatus.NOT_FOUND);
        }
    }
}
