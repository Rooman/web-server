package com.study;

import com.study.server.Server;

public class Test {
    public static void main(String[] args) {
        Server server = new Server();
        server.setWebAppPAth("src/main/resources/webapp/");
        server.start();
    }


}
