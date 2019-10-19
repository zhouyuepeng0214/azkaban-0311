package com.atguigu.azkaban;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaJob {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/opt/module/datas/java.log");
            fos.write("hello world!".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
